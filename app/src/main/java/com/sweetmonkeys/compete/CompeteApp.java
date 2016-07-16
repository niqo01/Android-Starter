package com.sweetmonkeys.compete;

import android.app.Application;
import android.support.annotation.NonNull;
import com.sweetmonkeys.compete.data.Injector;
import dagger.ObjectGraph;
import timber.log.Timber;

public class CompeteApp extends Application{

  private ObjectGraph objectGraph;

  @Override public void onCreate() {
    super.onCreate();

    if (BuildConfig.DEBUG) {
      Timber.plant(new Timber.DebugTree());
    } else {
      // TODO Crashlytics.start(this);
      // TODO Timber.plant(new CrashlyticsTree());
    }

    objectGraph = ObjectGraph.create(Modules.list(this));
    objectGraph.inject(this);
  }

  @Override public Object getSystemService(@NonNull String name) {
    if (Injector.matchesService(name)) {
      return objectGraph;
    }
    return super.getSystemService(name);
  }
}

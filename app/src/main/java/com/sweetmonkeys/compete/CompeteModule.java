package com.sweetmonkeys.compete;

import android.app.Application;
import com.sweetmonkeys.compete.data.DataModule;
import com.sweetmonkeys.compete.ui.UiModule;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(
    includes = {
        UiModule.class,
        DataModule.class
    },
    injects = {
        CompeteApp.class
    }
)
public class CompeteModule {
  private final CompeteApp app;

  public CompeteModule(CompeteApp app) {
    this.app = app;
  }

  //@Provides @Singleton Application provideApplication() {
  //  return app;
  //}
}

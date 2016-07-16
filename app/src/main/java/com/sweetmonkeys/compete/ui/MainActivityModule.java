package com.sweetmonkeys.compete.ui;

import android.support.v4.widget.DrawerLayout;
import com.sweetmonkeys.compete.CompeteModule;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(
    addsTo = CompeteModule.class,
    injects = TournamentsView.class
)
public class MainActivityModule {
  private final MainActivity mainActivity;

  MainActivityModule(MainActivity mainActivity) {
    this.mainActivity = mainActivity;
  }

  @Provides @Singleton DrawerLayout provideDrawerLayout() {
    return mainActivity.drawerLayout;
  }
}

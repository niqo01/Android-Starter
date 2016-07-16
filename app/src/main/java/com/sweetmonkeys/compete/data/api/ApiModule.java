package com.sweetmonkeys.compete.data.api;

import com.google.firebase.auth.FirebaseAuth;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(
    complete = false,
    library = true
)
public class ApiModule {

  @Provides @Singleton FirebaseAuth provideFirebaseAuth() {
    return FirebaseAuth.getInstance();
  }
}

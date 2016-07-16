package com.sweetmonkeys.compete.ui;

import dagger.Module;

@Module(
    injects = {
        MainActivity.class,
    },
    complete = false,
    library = true
)
public class UiModule {
}

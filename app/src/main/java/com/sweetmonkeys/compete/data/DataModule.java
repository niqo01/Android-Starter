package com.sweetmonkeys.compete.data;

import com.sweetmonkeys.compete.data.api.ApiModule;
import dagger.Module;

@Module(
    includes = ApiModule.class,
    complete = false,
    library = true
)
public class DataModule {
}

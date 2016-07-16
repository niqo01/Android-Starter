package com.sweetmonkeys.compete;

/**
 * Created by niqo on 7/15/16.
 */

final class Modules {
  static Object[] list(CompeteApp app) {
    return new Object[] {
        new CompeteModule(app)
    };
  }

  private Modules() {
    // No instances.
  }
}
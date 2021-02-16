package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.noeatsleepdev.geoflutterfire.GeoflutterfirePlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    GeoflutterfirePlugin.registerWith(registry.registrarFor("com.noeatsleepdev.geoflutterfire.GeoflutterfirePlugin"));
    FlutterFirebaseFirestorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin"));
    FlutterFirebaseCorePlugin.registerWith(registry.registrarFor("io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}

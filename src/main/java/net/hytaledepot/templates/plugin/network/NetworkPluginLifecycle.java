package net.hytaledepot.templates.plugin.network;

public enum NetworkPluginLifecycle {
  NEW,
  PRELOADING,
  SETTING_UP,
  READY,
  RUNNING,
  STOPPING,
  STOPPED,
  FAILED
}

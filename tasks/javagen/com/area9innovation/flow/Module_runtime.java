// HASH COLLISIONS: YES
// timestamp: 1.582199701E12

package com.area9innovation.flow;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_runtime {
	final Main runtime;
	Module_runtime(Main runtime) {
		this.runtime = runtime;
	}
	public Reference<Boolean> g_localStorageEnabled;
	public void init_localStorageEnabled() {
		g_localStorageEnabled=((Reference<Boolean>)(new Reference(true)));
	}
	Object f_println(Object astr) {
		if (runtime.m_securitymode.f_isLoggingEnabled()) {
			return runtime.h_Native.println(((Object)astr));
		} else {
			return null;
		}
	}
}

// HASH COLLISIONS: YES
// timestamp: 1.582199701E12

package com.area9innovation.flow;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_array {
	final Main runtime;
	Module_array(Main runtime) {
		this.runtime = runtime;
	}
	Object[] f_arrayPush(Object[] aarray, Object avalue) {
		return runtime.h_Native.replace(aarray, runtime.h_Native.length(aarray), avalue);
	}
	Object f_refArrayPush(Reference<Object[]> arefArray, Object aelem) {
		arefArray.value = f_arrayPush(arefArray.value, aelem);
		return null;
	}
}

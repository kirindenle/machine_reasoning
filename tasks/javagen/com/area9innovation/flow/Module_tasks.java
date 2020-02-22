// HASH COLLISIONS: YES
// timestamp: 1.5822876E12

package com.area9innovation.flow;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_tasks {
	final Main runtime;
	Module_tasks(Main runtime) {
		this.runtime = runtime;
	}
	Object[] f_fib1(int an) {
		if ((an==0)) {
			return runtime.arr_empty;
		} else {
			if ((an==1)) {
				return (new Object[] { 0 });
			} else {
				if ((an==2)) {
					return (new Object[] { 0, 1 });
				} else {
					final Object[] l0_rec = f_fib1((an-1));
					return runtime.h_Native.concat(l0_rec, (new Object[] { (((int)(l0_rec[(an-2)]))+((int)(l0_rec[(an-3)]))) }));
				}
			}
		}
	}
	Object[] f_fib2(int an) {
		if ((an==0)) {
			return runtime.arr_empty;
		} else {
			if ((an==1)) {
				return (new Object[] { 0 });
			} else {
				if ((an==2)) {
					return (new Object[] { 0, 1 });
				} else {
					final Reference<Object[]> l0_rec = ((Reference<Object[]>)(new Reference(f_fib2((an-1)))));
					runtime.m_array.f_refArrayPush(l0_rec, (((int)(l0_rec.value[(an-2)]))+((int)(l0_rec.value[(an-3)]))));
					return l0_rec.value;
				}
			}
		}
	}
	Object f_main() {
		final Object[] l0_a = (new Object[] { 1, 2, 3 });
		runtime.m_runtime.f_println(l0_a);
		runtime.m_runtime.f_println(f_showArray(l0_a));
		runtime.m_runtime.f_println(runtime.m_string.f_strGlue(runtime.h_Native.map(l0_a, ((Func1<Object,Object>)(Func1)runtime.gfw_i2s)), ", "));
		runtime.m_runtime.f_println(f_sumArray(l0_a));
		final int l1_n = 30;
		runtime.m_runtime.f_println(l1_n);
		runtime.m_runtime.f_println(f_fib1(l1_n));
		return runtime.m_runtime.f_println(f_fib2(l1_n));
	}
	Object[] f_showArray(Object[] aa) {
		return runtime.h_Native.map(aa, ((Func1<Object,Object>)(Func1)runtime.gfw_i2s));
	}
	int f_sum(int ax, int ay) {
		return (ax+ay);
	}
	int f_sumArray(Object[] aa) {
		return ((int)runtime.h_Native.fold(aa, 0, ((Func2<Object,Object, Object>)(Func2)runtime.gfw_sum)));
	}
}

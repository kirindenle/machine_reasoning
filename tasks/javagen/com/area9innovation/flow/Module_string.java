// HASH COLLISIONS: YES
// timestamp: 1.582199701E12

package com.area9innovation.flow;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_string {
	final Main runtime;
	Module_string(Main runtime) {
		this.runtime = runtime;
	}
	String f_i2s(int ai) {
		return Integer.toString((int)(ai));
	}
	String f_strGlue(Object[] aarr, String asep) {
		if (((Object[])aarr).length == 0) {
			return "";
		} else {
			if ((runtime.h_Native.length(aarr)==1)) {
				return ((String)(aarr[0]));
			} else {
				final Struct l2_$1 = runtime.m_list.f_makeList();
				final String l4_sep = asep;
				final Func3<Struct_Cons,Integer, Struct, String> l3_$0 = new Func3<Struct_Cons,Integer,Struct,String>() {
					final public Struct_Cons invoke(final Integer aidx, final Struct aacc, final String ae) {
						if ((((int)aidx)==0)) {
							return (new Struct_Cons(ae, aacc));
						} else {
							return (new Struct_Cons(ae, (new Struct_Cons(l4_sep, aacc))));
						}
					}
				};
				return runtime.h_Native.list2string(((Struct)runtime.h_Native.foldi(aarr, l2_$1, ((Func3<Object,Integer, Object, Object>)(Func3)l3_$0))));
			}
		}
	}
}

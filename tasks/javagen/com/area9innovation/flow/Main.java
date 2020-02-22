// HASH COLLISIONS: YES
// timestamp: 1.582344885427E12

package com.area9innovation.flow;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class Main extends FlowRuntime {
	static final Object[] arr_empty = new Object[0];
	static final SingletonStruct str_EmptyList = SingletonStruct.make(1,"EmptyList");
	static final SingletonStruct str_IllegalStruct = SingletonStruct.make(2,"IllegalStruct");
	static final SingletonStruct str_None = SingletonStruct.make(4,"None");
	final Module_tuples m_tuples;
	final Module_dynamic m_dynamic;
	final Module_maybe m_maybe;
	final Module_url m_url;
	final Module_list m_list;
	final Module_array m_array;
	final Module_flowstructs m_flowstructs;
	final Module_securitymode m_securitymode;
	final Module_runtime m_runtime;
	final Module_string m_string;
	final Module_tasks m_tasks;
	public Main(String[] args) {
		super(new Struct[] {
			new Struct_Cons(),
			str_EmptyList,
			str_IllegalStruct,
			new Struct_KeyValue(),
			str_None,
			new Struct_OWASP(),
			new Struct_Pair(),
			new Struct_Quadruple(),
			new Struct_Some(),
			new Struct_Triple()
		}, args);
		m_tuples = new Module_tuples(this);
		m_dynamic = new Module_dynamic(this);
		m_maybe = new Module_maybe(this);
		m_url = new Module_url(this);
		m_list = new Module_list(this);
		m_array = new Module_array(this);
		m_flowstructs = new Module_flowstructs(this);
		m_securitymode = new Module_securitymode(this);
		m_runtime = new Module_runtime(this);
		m_string = new Module_string(this);
		m_tasks = new Module_tasks(this);
	}
	final Func1<String,Integer> gfw_i2s = new Func1<String,Integer>() {
		final public String invoke(Integer a0) {
			return m_string.f_i2s(a0);
		}
	};
	final Func2<Integer,Integer, Integer> gfw_sum = new Func2<Integer,Integer, Integer>() {
		final public Integer invoke(Integer a0, Integer a1) {
			return m_tasks.f_sum(a0, a1);
		}
	};
	Native h_Native;
	private void init() {
		h_Native = super.getNativeHost(Native.class);
		m_url.init_redirectAdditionalFn();
		m_securitymode.init_loggingEnabled();
		m_securitymode.init_securityModes();
		m_runtime.init_localStorageEnabled();
	}
	protected void main() {
		init();
		m_tasks.f_main();
	}
	public static void main(String[] args) {
		Main runner = new Main(args);
		runner.start(null);
	}
}

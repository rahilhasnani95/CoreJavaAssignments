package Interface;

interface A1{};

interface B1{};

abstract class Z1{};

interface C1 extends B1{};

class D1 implements A1{};

class D2 implements C1{};

class Z2 extends Z1{};


public class TestInheritanceInterface {

	A1 a1 = new D1();
	//B1 b1 = new C1();
	Z1 z = new Z2();
	
	B1 bb =  (B1) new Z2();
	
	Z1 zzz = new C1();
	
	//Z1 hz = new D1();

	
}


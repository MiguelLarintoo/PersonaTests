package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.java.Persona;

class PersonaTests {

	 @Test
	 public void testConstructorDefault() {
		 Persona persona = new Persona();
		 assertEquals("", persona.toString().contains("Nombre:"));
	     assertTrue(persona.toString().contains("Edad: 0"));
	  }
	@Test
	void testPersonaStringIntChar() {
	}

	@Test
	void testPersonaStringIntCharDoubleDouble() {
	}

	@Test
	void testSetNombre() {
	}

	@Test
	void testSetEdad() {
	}

	@Test
	void testSetSexo() {
	}

	@Test
	void testSetPeso() {
	}

	@Test
	void testSetAltura() {
	}

	@Test
	void testCalcularIMC() {
	}

	@Test
	void testEsMayorDeEdad() {
	}

}

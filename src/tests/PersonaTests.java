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
        Persona persona = new Persona();
        persona.setNombre("Julia");
        assertTrue(persona.toString().contains("Nombre: Julia"));
    }

    @Test
    void testSetEdad() {
        Persona persona = new Persona();
        persona.setEdad(18);
        assertTrue(persona.toString().contains("Edad: 18"));
    }

    @Test
    void testSetSexo() {
        Persona persona = new Persona();
        persona.setSexo('M');
        assertTrue(persona.toString().contains("Sexo: mujer"));
    }

    @Test
    void testSetPeso() {
        Persona persona = new Persona();
        persona.setPeso(65);
        assertTrue(persona.toString().contains("Peso: 65.0 kg"));
    }

    @Test
    void testSetAltura() {
        Persona persona = new Persona();
        persona.setAltura(1.80);
        assertTrue(persona.toString().contains("Altura: 1.8 metros"));
    }

	@Test
	void testCalcularIMC() {
	}

	@Test
	void testEsMayorDeEdad() {
	}

}

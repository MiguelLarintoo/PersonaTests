package tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.java.Persona;

class PersonaTests {

	 @Test
	 public void testConstructorConParametrosBasicos() {
	      Persona persona = new Persona("Juan", 25, 'H');
	      assertTrue(persona.toString().contains("Nombre: Juan"));
	      assertTrue(persona.toString().contains("Edad: 25"));
	      assertTrue(persona.toString().contains("Sexo: hombre"));
	    }

	 @Test
	 public void testConstructorConTodosLosParametros() {
		 Persona persona = new Persona("Ana", 30, 'M', 60.5, 1.65);
		 assertTrue(persona.toString().contains("Nombre: Ana"));
		 assertTrue(persona.toString().contains("Edad: 30"));
		 assertTrue(persona.toString().contains("Sexo: mujer"));
	    }

    @Test
    public void testSetNombre() {
        Persona persona = new Persona();
        persona.setNombre("Julia");
        assertTrue(persona.toString().contains("Nombre: Julia"));
    }

    @Test
    public void testSetEdad() {
        Persona persona = new Persona();
        persona.setEdad(18);
        assertTrue(persona.toString().contains("Edad: 18"));
    }

    @Test
    public void testSetSexo() {
        Persona persona = new Persona();
        persona.setSexo('M');
        assertTrue(persona.toString().contains("Sexo: mujer"));
    }

    @Test
    public void testSetPeso() {
        Persona persona = new Persona();
        persona.setPeso(65);
        assertTrue(persona.toString().contains("Peso: 65.0 kg"));
    }

    @Test
    public void testSetAltura() {
        Persona persona = new Persona();
        persona.setAltura(1.80);
        assertTrue(persona.toString().contains("Altura: 1.8 metros"));
    }

	@Test
	public void testCalcularIMCInfrapeso() {
		Persona persona = new Persona();
		persona.setPeso(50);
		persona.setAltura(1.80);
		assertEquals(-1, persona.calcularIMC());
	}
	
	@Test
	public void testCalcularIMCSobrePeso() {
		Persona persona = new Persona();
		persona.setPeso(150);
		persona.setAltura(1.80);
		assertEquals(1, persona.calcularIMC());
	}
	@Test
	public void testCalcularIMCPesoIdeal() {
		Persona persona = new Persona();
		persona.setPeso(80);
		persona.setAltura(1.80);
		assertEquals(0, persona.calcularIMC());
	}
	@Test
	public void testCalcularIMCNull() {
		Persona persona = new Persona();
		assertNull(persona.calcularIMC());
		
	}


    @Test
    public void testEsMayorDeEdadTrue() {
        Persona persona = new Persona("Pedro", 20, 'H');
        assertTrue(persona.esMayorDeEdad());
    }

    @Test
    public void testEsMayorDeEdadFalse() {
        Persona persona = new Persona("Laura", 16, 'M');
        assertFalse(persona.esMayorDeEdad());
    }


}

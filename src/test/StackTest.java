package test;

import org.junit.Before;
import org.junit.Test;
import stack.Stack;

import static org.junit.Assert.*;

public class StackTest {

    private Stack<Integer> pilha;

    @Before
    public void init() {
        this.pilha = new Stack<>();
    }

    @Test
    public void testPilhaVazia() {
        assertTrue(pilha.estaVazia());  
    }

    @Test
    public void testPilhaNaoEstaVazia() {
        pilha.empilhar(10);
        assertFalse(pilha.estaVazia());  
    }

    @Test
    public void testTamanhoPilha() {
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        assertEquals(3, pilha.tamanho());  
    }

    @Test
    public void testEmpilhar() {
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        assertEquals(3, pilha.tamanho());  
    }

    @Test
    public void testDesempilhar() throws Exception {
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        int valor = pilha.desempilhar();  
        assertEquals(30, valor);
    }

    @Test(expected = Exception.class)
    public void testDesempilharPilhaVazia() throws Exception {
        pilha.desempilhar();  
    }
}

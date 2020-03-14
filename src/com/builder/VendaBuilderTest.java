package com.builder;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class VendaBuilderTest extends TestCase {

		
		@Test
		public void testClientePF() {
			Produto farinha = new Produto("Farinha", 2.00);
			Venda venda = new VendaBuilder()
					.Data("10/01/2025")
					.ClientePF("Geoclecio", "000.000.000-00")
					.Frete(10.00)
					.Item(3, farinha)
					.Funcionario("Cida")
					.Build();
			
			assertEquals("Data: 10/01/2025"
					+ "\nCliente: Geoclecio | CPF: 000.000.000-00["
					+ "\nItem: Farinha | Preço: R$: 2.0 | Quantidade: 3]"
					+ "\nFrete: R$:10.0"
					+ "\nFuncionario: Cida",venda.toString());
		}
		
		@Test
		public void testClientePF3Produtos() {
			
			Produto farinha = new Produto("Farinha", 2.00);
			Produto maca = new Produto("Maçã", 1.50);
			Produto goiaba = new Produto("Goiaba", 2.50);
			
			Venda venda = new VendaBuilder()
					.Data("10/01/2025")
					.ClientePF("Welton", "000.000.000-00")
					.Frete(50.00)
					.Item(3, farinha)
					.Item(5, maca)
					.Item(25, goiaba)
					.Funcionario("Marcos")
					.Build();
			
			assertEquals("Data: 10/01/2025"
					+ "\nCliente: Welton | CPF: 000.000.000-00["
					+ "\nItem: Farinha | Preço: R$: 2.0 | Quantidade: 3, "
					+ "\nItem: Maçã | Preço: R$: 1.5 | Quantidade: 5, "
					+ "\nItem: Goiaba | Preço: R$: 2.5 | Quantidade: 25]"
					+ "\nFrete: R$:50.0"
					+ "\nFuncionario: Marcos",venda.toString());
		}
		
		@Test
		public void testClientePJ() {
			Produto faca = new Produto("Faca", 20.00);
			Venda venda = new VendaBuilder()
					.Data("11/08/2020")
					.ClientePJ("Couros LTD", "**.***.***/****-**")
					.Frete(20.00)
					.Item(5000, faca)
					.Funcionario("Audir")
					.Build();
			
			assertEquals("Data: 11/08/2020"
					+ "\nCliente: Couros LTD | CNPJ: **.***.***/****-**["
					+ "\nItem: Faca | Preço: R$: 20.0 | Quantidade: 5000]"
					+ "\nFrete: R$:20.0"
					+ "\nFuncionario: Audir",venda.toString());
		}
		
		@Test
		public void testClientePJ5Produtos() {
			
			Produto joystick = new Produto("Joystick", 15.00);
			Produto mouse = new Produto("Mouse", 20.50);
			Produto mousePad = new Produto("Mousepad", 22.00);
			Produto teclado = new Produto("Teclado", 55.20);
			Produto penDrive = new Produto("Pen Drive", 10.20);
			
			Venda venda = new VendaBuilder()
					.Data("15/01/2025")
					.ClientePJ("Dachina Eletros", "**.***.***/****-**")
					.Frete(150.55)
					.Item(2000, joystick)
					.Item(2500, mouse)
					.Item(2000, mousePad)
					.Item(1500, teclado)
					.Item(2500, penDrive)
					.Funcionario("Calisto")
					.Build();
			
			assertEquals("Data: 15/01/2025"
					+ "\nCliente: Dachina Eletros | CNPJ: **.***.***/****-**["
					+ "\nItem: Joystick | Preço: R$: 15.0 | Quantidade: 2000, "
					+ "\nItem: Mouse | Preço: R$: 20.5 | Quantidade: 2500, "
					+ "\nItem: Mousepad | Preço: R$: 22.0 | Quantidade: 2000, "
					+ "\nItem: Teclado | Preço: R$: 55.2 | Quantidade: 1500, "
					+ "\nItem: Pen Drive | Preço: R$: 10.2 | Quantidade: 2500]"
					+ "\nFrete: R$:150.55"
					+ "\nFuncionario: Calisto",venda.toString());
		}

}

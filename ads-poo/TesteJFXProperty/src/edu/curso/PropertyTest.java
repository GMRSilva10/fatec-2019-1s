package edu.curso;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class PropertyTest {
	
	static class Observador implements ChangeListener<String> {
		@Override
		public void changed(ObservableValue<? extends String> observable, 
				String oldValue, String newValue) {
			System.out.printf("Mudou o valor de %s para %s", 
					oldValue, newValue);		
		}
	}

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Jo�o");
		a.setNome("Jos�");
		
		ChangeListener<String> observador = new Observador();
		StringProperty nome = new SimpleStringProperty("Jo�o");
		nome.addListener(observador);
	}
}
package JUnit;

public class EmpleadoBR {
float salario;
int tipoVendedor;
/*El salario base ser� 1000 euros si el empleado es de tipo vendedor, y 
 * de 1500 euros si es de tipo encargado. A esta cantidad se le sumar� una 
 * prima de 100 euros si ventasMes es mayor o igual que 1000 euros, y de 200 euros si 
 * fuese al menos de 1500 euros. Por �ltimo, cada hora extra se pagar� a 20 euros. 
 * Si tipo es null, o ventasMes o horasExtra toman valores negativos el m�todo lanzar� 
 * una excepci�n de tipo BRException.*/
public EmpleadoBR(int tipoVendedor){
	this.tipoVendedor=tipoVendedor;
	if(tipoVendedor==0) this.salario=1000;
	else if(tipoVendedor==1) this.salario=1500;
}
float calculaSalarioBruto(int tipo, float ventasMes,float horasExtra){
	float salarioBruto=0;
	if(tipoVendedor==0) salarioBruto=1000;
	else if(tipoVendedor==1) salarioBruto=1500;
	if(ventasMes> 1000 && ventasMes<1500) salarioBruto=salarioBruto+100;
	else if(ventasMes >1500) salarioBruto=salarioBruto+100;
	salarioBruto=salarioBruto+20*horasExtra;
	this.salario=salarioBruto;
	return salarioBruto;
	
}
/*Si el salario bruto es menor de 1000 euros, no se aplicar� ninguna retenci�n. Para salarios 
 * a partir de 1000 euros, y menores de 1500 euros se les aplicar� un 16%, y a los salarios 
 * a partir de 1500 euros se les aplicar� un 18%. El m�todo nos devolver� 
 * salarioBruto * (1-retencion), o BRExcepcion si el salario es menor que cero.*/
float calculaSalarioNeto(float salarioBruto){
	float salarioNeto=0;
	if(salarioBruto>1000 && salarioBruto<1500){
		salarioNeto=salarioBruto*0.84f;
	}
	else if(salarioBruto>1500){
		salarioNeto=salarioBruto*0.82f;
	}
		return salarioNeto;
	}


}
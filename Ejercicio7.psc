Algoritmo Ejercio7
	
	Definir numAl, contPar, contImpar, contCero como Entero
	Definir porcPar, porcImpar, porcCero como Real
	
	Para i<-1 Hasta 15 Con Paso 1 Hacer
		
		numAl <- Aleatorio(0,36)
		
		Si numAl MOD 2 = 0 Entonces
			Si numAl=0 Entonces
				contCero <- contCero + 1
			SiNo
				contPar <- contPar + 1
			Fin Si
		SiNo
			contImpar <- contImpar + 1
		Fin Si
		
	Fin Para
	
	porcCero <- contCero / 15
	porcPar <- contPar / 15
	porcImpar <- contImpar / 15
	
	Escribir "Porcentaje de ceros: " porcCero
	Escribir "Porcentaje de pares: " porcPar
	Escribir "Porcentaje de impares: " porcImpar
	
FinAlgoritmo

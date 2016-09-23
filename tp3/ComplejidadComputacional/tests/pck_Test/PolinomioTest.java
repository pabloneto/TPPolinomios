package pck_Test;

import org.junit.Test;

import org.junit.Assert;
import pck_polinomio.Polinomio;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.util.Calendar;

public class PolinomioTest {
	
	@Test
	public void casoPolinomioIncompletoConEvaluarMSucesivas(){
		Polinomio pol1 = new Polinomio("Caso0.0.PolinomioIncompleto.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarMSucesivas(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioIncompletoConEvaluarMSucesivas:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.0.PolinomioIncompleto.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioIncompletoConevaluarRecursiva(){
		Polinomio pol1 = new Polinomio("Caso0.0.PolinomioIncompleto.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarRecursiva(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioIncompletoConevaluarRecursiva:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.0.PolinomioIncompleto.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioIncompletoConevaluarRecursivaPar(){
		Polinomio pol1 = new Polinomio("Caso0.0.PolinomioIncompleto.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarRecursivaPar(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioIncompletoConevaluarRecursivaPar:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.0.PolinomioIncompleto.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioIncompletoConevaluarProgDinamica(){
		Polinomio pol1 = new Polinomio("Caso0.0.PolinomioIncompleto.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarProgDinamica(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioIncompletoConevaluarProgDinamica:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.0.PolinomioIncompleto.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioIncompletoConevaluarMejorada(){
		Polinomio pol1 = new Polinomio("Caso0.0.PolinomioIncompleto.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarMejorada(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioIncompletoConevaluarMejorada:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.0.PolinomioIncompleto.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioIncompletoConevaluarPow(){
		Polinomio pol1 = new Polinomio("Caso0.0.PolinomioIncompleto.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarPow(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioIncompletoConevaluarPow:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.0.PolinomioIncompleto.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioIncompletoConevaluarHorner(){
		Polinomio pol1 = new Polinomio("Caso0.0.PolinomioIncompleto.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarHorner(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioIncompletoConevaluarHorner:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.0.PolinomioIncompleto.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioConTerminoIndependienteConEvaluarMSucesivas(){
		Polinomio pol1 = new Polinomio("Caso0.1.PolinomioConTerminoIndependiente.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarMSucesivas(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioConTerminoIndependienteConEvaluarMSucesivas:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.1.PolinomioConTerminoIndependiente.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioConTerminoIndependienteConevaluarRecursiva(){
		Polinomio pol1 = new Polinomio("Caso0.1.PolinomioConTerminoIndependiente.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarRecursiva(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioConTerminoIndependiente:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.1.PolinomioConTerminoIndependiente.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioConTerminoIndependienteConevaluarRecursivaPar(){
		Polinomio pol1 = new Polinomio("Caso0.1.PolinomioConTerminoIndependiente.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarRecursivaPar(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioConTerminoIndependienteConevaluarRecursivaPar:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.1.PolinomioConTerminoIndependiente.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioConTerminoIndependienteConevaluarProgDinamica(){
		Polinomio pol1 = new Polinomio("Caso0.1.PolinomioConTerminoIndependiente.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarProgDinamica(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioConTerminoIndependienteConevaluarProgDinamica:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.1.PolinomioConTerminoIndependiente.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioConTerminoIndependienteConevaluarMejorada(){
		Polinomio pol1 = new Polinomio("Caso0.1.PolinomioConTerminoIndependiente.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarMejorada(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioConTerminoIndependienteConevaluarMejorada:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.1.PolinomioConTerminoIndependiente.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioConTerminoIndependienteConevaluarPow(){
		Polinomio pol1 = new Polinomio("Caso0.1.PolinomioConTerminoIndependiente.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarPow(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioConTerminoIndependienteConevaluarPow:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.1.PolinomioConTerminoIndependiente.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioConTerminoIndependienteConevaluarHorner(){
		Polinomio pol1 = new Polinomio("Caso0.1.PolinomioConTerminoIndependiente.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarHorner(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioConTerminoIndependienteConevaluarHorner:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.1.PolinomioConTerminoIndependiente.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioEvaluado0ConEvaluarMSucesivas(){
		Polinomio pol1 = new Polinomio("Caso0.2.PolinomioEvaluado0.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarMSucesivas(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioEvaluado0ConEvaluarMSucesivas:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.2.PolinomioEvaluado0.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioEvaluado0ConevaluarRecursiva(){
		Polinomio pol1 = new Polinomio("Caso0.2.PolinomioEvaluado0.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarRecursiva(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioEvaluado0:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.2.PolinomioEvaluado0.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioEvaluado0ConevaluarRecursivaPar(){
		Polinomio pol1 = new Polinomio("Caso0.2.PolinomioEvaluado0.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarRecursivaPar(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioEvaluado0ConevaluarRecursivaPar:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.2.PolinomioEvaluado0.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioEvaluado0ConevaluarProgDinamica(){
		Polinomio pol1 = new Polinomio("Caso0.2.PolinomioEvaluado0.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarProgDinamica(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioEvaluado0ConevaluarProgDinamica:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.2.PolinomioEvaluado0.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioEvaluado0ConevaluarMejorada(){
		Polinomio pol1 = new Polinomio("Caso0.2.PolinomioEvaluado0.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarMejorada(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioEvaluado0ConevaluarMejorada:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.2.PolinomioEvaluado0.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioEvaluado0ConevaluarPow(){
		Polinomio pol1 = new Polinomio("Caso0.2.PolinomioEvaluado0.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarPow(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioEvaluado0ConevaluarPow:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.2.PolinomioEvaluado0.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
	@Test
	public void casoPolinomioEvaluado0ConevaluarHorner(){
		Polinomio pol1 = new Polinomio("Caso0.3.PolinomioEvaluado0.in");
		Calendar tIni = new GregorianCalendar();
		double resActual = pol1.evaluarHorner(0.01);
		Calendar tFin = new GregorianCalendar();
		System.out.println("T.Ejecución casoPolinomioEvaluado0ConevaluarHorner:"+(tFin.getTimeInMillis()-tIni.getTimeInMillis()));
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("Caso0.3.PolinomioEvaluado0.out"));
			double resEsperado = sc.nextDouble();
			sc.useLocale(Locale.ENGLISH);
			Assert.assertTrue(resActual == resEsperado);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
	}
}

package superclases;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		int randomnum = random.nextInt(2);
		int contV=0;
		int contF=0;
		Empleado e = new Empleado();
		System.out.println(e.getNombre());
		if(e.Altura(randomnum)) {
			System.out.println("Es alto");
		}else {
			System.out.println("No es alto");
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(e.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(e.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(e.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		
		System.out.println("\n");
		Niño n = new Niño();
		System.out.println(n.getNombre());
		if(n.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(n.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(n.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(n.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		
		System.out.println("\n");
		niña ni = new niña();
		System.out.println(ni.getNombre());
		if(ni.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(ni.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(ni.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(ni.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		System.out.println("\n");
		secretario s = new secretario();
		System.out.println(s.getNombre());
		if(s.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(s.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(s.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(s.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		System.out.println("\n");
		profesor p = new profesor();
		System.out.println(p.getNombre());
		if(p.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(p.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(p.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(p.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		
		System.out.println("\n");
		actuario a = new actuario();
		System.out.println(a.getNombre());
		if(a.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(a.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(a.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(a.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		
		System.out.println("\n");
		bombero b = new bombero();
		System.out.println(b.getNombre());
		if(b.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(b.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(b.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(b.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		
		System.out.println("\n");
		inge i = new inge();
		System.out.println(i.getNombre());
		if(i.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(i.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(i.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(i.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		
		
		System.out.println("\n");
		mama m = new mama();
		System.out.println(m.getNombre());
		if(m.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(m.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(m.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(m.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		
		
		System.out.println("\n");
		papa pa = new papa();
		System.out.println(pa.getNombre());
		if(pa.Altura(randomnum)) {
			System.out.println("Es alto");
			contV++;
		}else {
			System.out.println("No es alto");
			contF++;
		}
		randomnum=0;
		 randomnum = random.nextInt(2);
		if(pa.Atractiva(randomnum)) {
			System.out.println("Es Atractivo");
			contV++;
		}else {
			System.out.println("No es Actractiva");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(pa.Gorra(randomnum)) {
			System.out.println("Usa Gorra");
			contV++;
		}else {
			System.out.println("No Usa Gorra");
			contF++;
		}
		randomnum=0;
		randomnum = random.nextInt(2);
		if(pa.Pareja(randomnum)) {
			System.out.println("Tiene pareja");
			contV++;
		}else {
			System.out.println("No Tiene pareja");
			contF++;
		}
		
		System.out.println("\nEl numero de verdaderos es: "+contV);
		System.out.println("El numero de falsos es: "+contF);
	}

}

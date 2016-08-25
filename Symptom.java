package hackRU_Spring2016;

import java.util.*;
import java.util.Scanner;


public class Symptom {
	String eng = "";
	String spa = "";
	String pun = "";

	public Symptom(String eng, String spa){
		this.eng = eng;
		this.spa = spa;
		//this.pun = pun;
	}

	public static void makeArrayEntry(String eng, String spa, Symptom[] parts, int i){
		Symptom x = new Symptom(eng, spa);
		parts[i] = x;
	}

	public static void main(String[] args){

		//type to handle reason
		Symptom[] type = new Symptom[3];
		type[0]= new Symptom("a body part hurts", "una parte del cuerpo duele");
		type[1]= new Symptom("you are experiencing..", "sientes que..");
		type[2]= new Symptom("you've noticed a condition..", "encontraste..");

		//language choices
		System.out.println("Select Your Language");
		System.out.println("0 for English");
		System.out.println("1 para Espanol");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int lang = in.nextInt();

		//what's wrong?
		if (lang == 0){
			System.out.println("What seems to be the problem?");
			for (int i = 0; i < type.length; i++){
				System.out.println(i + " if " + type[i].eng);}
		}
		else if (lang == 1){
			System.out.println("¿Que paso?");
			for (int i = 0; i < type.length; i++){
				System.out.println(i + " para si " + type[i].spa);}
		}

		//the reason
		Scanner in2 = new Scanner(System.in);
		int lang2 = in2.nextInt();


		//make array with body parts here
		//ports 
		String[] port = new String[65];

		port[0] = "Temples";
		port[1] = "Head";
		port[2] = "Left Eye";
		port[3] = "Right Eye";
		port[4] = "Both Eyes";
		port[5] = "Left Ear";
		port[6] = "Right Ear";
		port[7] = "Both Ears";
		port[8] = "Nose";
		port[9] = "Mouth";
		port[10] = "Gums";
		port[11] = "Teeth";
		port[12] = "Tongue";
		port[13] = "Teeth";
		port[14] = "Throat";
		port[15] = "Neck";
		//neck down front
		port[16] = "Left Shoulder";
		port[17] = "Right Shoulder";
		port[18] = "Both Shoulders";
		port[19] = "Left Side of Chest";
		port[20] = "Right Side of Chest";
		port[21] = "Center of Chest";
		port[22] = "Both Sides of Chest";
		port[23] = "Left Breast";
		port[24] = "Right Breast";
		port[25] = "Both Breasts";
		port[26] = "Left Side of Abdomen";
		port[27] = "Right Side of Abdomen";
		port[28] = "Center of Abdomen";
		port[29] = "Both Sides of Abdomen";
		port[30] = "Bladder";
		port[31] = "Crotch";
		port[32] = "Left Thigh";
		port[33] = "Right Thigh";
		port[34] = "Both Thighs";
		port[35] = "Left Knee";
		port[36] = "Right Knee";
		port[37] = "Both Knees";
		port[38] = "Left Shin";
		port[39] = "Right Shin";
		port[40] = "Both Shin";
		port[41] = "Left Ankle";
		port[42] = "Right Ankle";
		port[43] = "Both Ankle";
		port[44] = "Left Foot";
		port[45] = "Right Foot";
		port[46] = "Both Feet";
		port[47] = "Left Arm";
		port[48] = "Right Arm";
		port[49] = "Both Arms";
		port[50] = "Left Wrist";
		port[51] = "Right Wrist";
		port[52] = "Both Wrists";
		port[53] = "Left Hand";
		port[54] = "Right Hand";
		port[55] = "Both Hands";
		//back
		port[56] = "Left Elbow";
		port[57] = "Right Elbow";
		port[58] = "Both Elbows";
		port[59] = "Upper Back";
		port[60] = "Lower Back";
		port[61] = "Buttocks";
		port[62] = "Left Heel";
		port[63] = "Right Heel";
		port[64] = "Both Heels";		


		//Same thing, but in Spanish
		String[] spaPort = new String[65];
		spaPort[0] = "templos";
		spaPort[1] = "Cabeza";
		spaPort[2] = "Ojo izquierdo";
		spaPort[3] = "Ojo derecho";
		spaPort[4] = "Los dos ojos";
		spaPort[5] = "Oreja izquierda";
		spaPort[6] = "Oreja derecha";
		spaPort[7] = "ambos oídos";
		spaPort[8] = "Nariz";
		spaPort[9] = "Boca";
		spaPort[10] = "Cena";
		spaPort[11] = "Dientes";
		spaPort[12] = "Lengua";
		spaPort[13] = "Dientes";
		spaPort[14] = "Garganta";
		spaPort[15] = "Cuello";
		spaPort[16] = "Hombro izquierdo";
		spaPort[17] = "Hombro derecho";
		spaPort[18] = "ambos hombros";
		spaPort[19] = "Lado izquierdo del pecho";
		spaPort[20] = "Lado derecho del pecho";
		spaPort[21] = "Centro del pecho";
		spaPort[22] = "Ambos lados del pecho";
		spaPort[23] = "pecho izquierdo";
		spaPort[24] = "mama derecha";
		spaPort[25] = "ambos senos";
		spaPort[26] = "Lado izquierdo del abdomen";
		spaPort[27] = "Lado derecho del abdomen";
		spaPort[28] = "Centro de Abdomen";
		spaPort[29] = "Ambos lados del abdomen";
		spaPort[30] = "Vejiga";
		spaPort[31] = "Entrepierna";
		spaPort[32] = "Muslo izquierdo";
		spaPort[33] = "Muslo derecho";
		spaPort[34] = "ambos muslos";
		spaPort[35] = "Rodilla izquierda";
		spaPort[36] = "Rodilla derecha";
		spaPort[37] = "ambas rodillas";
		spaPort[38] = "Shin izquierda";
		spaPort[39] = "derecho Shin";
		spaPort[40] = "tanto Shin";
		spaPort[41] = "Tobillo izquierdo";
		spaPort[42] = "tobillo derecho";
		spaPort[43] = "tanto la altura del tobillo";
		spaPort[44] = "Pie izquierdo";
		spaPort[45] = "Pie derecho";
		spaPort[46] = "Ambos pies";
		spaPort[47] = "Brazo izquierdo";
		spaPort[48] = "Brazo derecho";
		spaPort[49] = "Ambos brazos";
		spaPort[50] = "Muñeca izquierda";
		spaPort[51] = "Muñeca derecha";
		spaPort[52] = "ambas muñecas";
		spaPort[53] = "Mano izquierda";
		spaPort[54] = "Mano derecha";
		spaPort[55] = "Ambas manos";
		spaPort[56] = "codo izquierdo";
		spaPort[57] = "derecho del codo";
		spaPort[58] = "ambos codos";
		spaPort[59] = "Superior de la espalda";
		spaPort[60] = "Espalda baja";
		spaPort[61] = "Nalgas";
		spaPort[62] = "talón izquierdo";
		spaPort[63] = "talón derecho";
		spaPort[64] = "Los dos talones";


		//combine parts
		Symptom[] parts = new Symptom[port.length];
		for (int i = 0; i < parts.length; i++){
			makeArrayEntry(port[i], spaPort[i], parts, i);
		}


		//print out body parts if hurting
		if (lang == 0 && lang2 ==0){
			System.out.println("Where does it hurt?");
			for (int i = 0; i < parts.length; i++){
				System.out.println(i + " for " + parts[i].eng);
			}
		}
		else if (lang == 1 && lang2 == 0){
			System.out.println("¿Donde duele?");
			for (int i = 0; i < parts.length; i++){
				System.out.println(i + " para si " + parts[i].spa);
			}
		}
		Scanner whHurt = new Scanner(System.in);
		int whereHurt = whHurt.nextInt();
		//whereHurt is the index


		//make array with feelings
		String[] feel = new String[8];
		feel[0] = "Nausea";
		feel[1] = "Fatigue";
		feel[2] = "Diarrhoea";
		feel[3] = "Constipation";
		feel[4] = "Sadness";
		feel[5] = "Flu";
		feel[6] = "Cold";
		feel[7] = "Congestion";

		String[]spaFeel = new String[8];
		spaFeel[0] = "Náusea";
		spaFeel[1] = "Fatiga";
		spaFeel[2] = "Diarrea";
		spaFeel[3] = "Estreñimiento";
		spaFeel[4] = "Tristeza";
		spaFeel[5] = "Gripe";
		spaFeel[6] = "Frío";
		spaFeel[7] = "Congestión";

		Symptom[] feels = new Symptom[feel.length];

		for (int i = 0; i < feels.length; i++){
			makeArrayEntry(feel[i], spaFeel[i], feels, i);
		}

		//print out feelings if feeling
		if (lang == 0 && lang2 == 1){
			System.out.println("What are you feeling?");
			for (int i = 0; i < feels.length; i++){
				System.out.println(i + " if you are experiencing " + feels[i].eng);
			}
		}
		else if (lang == 1 && lang2 == 1){
			System.out.println("¿Que estás sintiendo?");
			for (int i = 0; i < feels.length; i++){
				System.out.println(i + " para si tu sientes " + feels[i].spa);
			}
		}

		Scanner whFeel = new Scanner(System.in);
		int whereFeel = whFeel.nextInt();
		//index of feel if feel
		

		String[] noticed = new String[5];
		noticed[0] = "Rash(es)";
		noticed[1] = "Bruise(s)";
		noticed[2] = "Pimple(s)";
		noticed[3] = "Mole(s)";
		noticed[4] = "Hive(s)";

		String[] spaNoticed = new String[5];
		spaNoticed[0] = "Erupción(es)";
		spaNoticed[1] = "Moretón(es)";
		spaNoticed[2] = "Espinilla(s)";
		spaNoticed[3] = "Topo(s)";
		spaNoticed[4] = "Urticaria(s)";

		Symptom[] notice = new Symptom[5];
		for (int i = 0; i < notice.length; i++){
			makeArrayEntry(noticed[i], spaNoticed[i], notice, i);
		}

		if (lang == 0 && lang2 == 2){
			System.out.println("What skin condition have you developed?");
			for (int i = 0; i < notice.length; i++){
				System.out.println(i + " if you see " + notice[i].eng);
			}
		}
		else if (lang == 1 && lang2 == 2){
			System.out.println("¿Qué condiciones de la piel que ha desarrollado?");
			for (int i = 0; i < notice.length; i++){
				System.out.println(i + " if you see " + notice[i].spa);
			}
		}
		Scanner whNotice = new Scanner(System.in);
		int whereNotice = whNotice.nextInt();
		//index of notice if noticed

		if (lang == 0){
			System.out.println("How long has this been going on?");
			
		}
		else if (lang == 1){
			System.out.println("¿Por cuánto tiempo tienes esto?");
			
		}
		
		Scanner time = new Scanner(System.in);
		String timeE = time.nextLine();
		//time
		
		if (lang == 0){
			System.out.println("Thank you!");
		}
		else{
			System.out.println("¡Gracias!");
		}
		
		try {
		    Thread.sleep(2000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		//Comp in English if Spanish
		if (lang == 1){
			//hurt
			if (lang2 == 0){
				System.out.println("Patient's " + parts[whereHurt] + " has been hurting for " + timeE);
			}

			//feel
			else if (lang2 == 1){
				System.out.println("Patient has been experiencing " + feels[whereFeel] + " for " + timeE);
			}
			//noticed
			else if (lang2 == 2){
				System.out.println("Patient has noticed " + noticed[whereNotice] + " since the last " + timeE);
			}
		}
		
		//Comp in Spanish if English
		else if (lang == 0){
			//hurt
			if (lang2 == 0){
				System.out.println(timeE);
			}
			
			//feel
			else if (lang2 == 1){
				System.out.println(timeE);
			}
			//noticed
			else if (lang2 == 2){
				System.out.println(timeE);
			}
			}
			
	}

}
package uvsq.M1.td1.Exo3_5;
import java.time.LocalDateTime;

public class UneClasseMetier {
	

		public void uneMethodeMetier(UneInterfaceMetier log) {
			log.affiche(LocalDateTime.now() + "Debut methode métier");
			
			log.affiche(LocalDateTime.now() + "Fin methode métier");
		}
	}



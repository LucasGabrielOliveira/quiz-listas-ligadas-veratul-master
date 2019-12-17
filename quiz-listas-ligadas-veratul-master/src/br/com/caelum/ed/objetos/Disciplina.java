package br.com.caelum.ed.objetos;

public class Disciplina {
    
     private String nome;
     private String Objetivo;
     private Int CargaHoraTeo;
     private Int CargaHoraPrati;

     public void setNome(String nome) 
     {
          this.nome = nome;
     }

     public String getNome() 
     {
          return this.nome;
     }
     
     public void setObjeto(String Objetivo)
     {
          this.objetivo = objetivo;
     }
     public String getObjetivo()
     {
          return this.objetivo;
     }
     public void setCargaHoraTeo(Int CargaHoraTeo)
     {
          this.CargaHoraTeo = CargaHoraTeo;
     }
     public Int getCargaHoraTeo()
     {
          return this.CargaHoraTeo;
     }
     public void setCargaHoraPrati(Int CargaHoraPrati)
     {
          this.CargaHoraPrati = CargaHoraPrati;
     }
     public Int getCargaHoraPrati()
     {
          return this.CargaHoraPrati;
     }
     public String toString() {
		if (nome != null) {
			return "Disciplina [nome=" + nome + ", objetivo=" + objetivo + ", CargaHoraTeo=" + CargaHoraTeo + ", CargaHoraPrati=" + CargaHoraPrati + "]";
		}else{
		return "Disciplina [nome=" + nome + ", objetivo=" + objetivo + ", nome=Disciplina Invalida "  + "]";
          }
     }
}

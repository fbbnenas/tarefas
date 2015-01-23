package tarefas

class Tarefa {
	
	int tempoPlanejado
	int tempoExecutado
	boolean finalizada
	String titulo
	String descricao
	Usuario responsavel
	Projeto projeto
	
    static constraints = {
	
        tempoPlanejado{nullable:false}
		tempoExecutado{nullable:true}
		finalizada{nullable:true}
		titulo{nullable: false; maxSize:32}
		descricao{nullable:true; maxSize:255}
		responsavel{nullable:true}
		projeto{nullable:false}
	
    }

    String toString(){
        this.titulo
    }
}

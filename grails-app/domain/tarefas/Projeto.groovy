package tarefas

class Projeto {

    String nome
	
	static constraints = {
		nome{nullable:false; maxSize:32}
    }

    String toString(){
        this.nome
    }
}

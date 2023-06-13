
    @Tabela(table="Pessoa")
    public class Pessoa {

        @Colunas(colummn="nome")
        private String nome;

        @Colunas(colummn="end")
        private String endereco;

        @Colunas(colummn = "idade")
        private int idade;

        public Pessoa(String nome, String endereco, int idade) {
            this.nome = nome;
            this.endereco = endereco;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

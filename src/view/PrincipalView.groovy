package view

class Principal {
    static def main(){
        String opcao

        header()
        menu()
        Scanner input = new Scanner(System.in)
        print('Digite uma das opções a cima: ')
        opcao = input.nextLine()

        while (opcao != '0'){
            if (opcao == '1'){
                PessoaView.listarCandidatos()
            } else if (opcao == '2'){
                PessoaView.listarEmpresas()
            } else if (opcao != '0') {
                println("Opção incorreta!")
            }

            header()
            menu()
            print('Digite uma das opções a cima: ')
            opcao = input.nextLine()
        }
    }

    static void header(){
        println(" ___________________________________________________ ");
        println("|                   LinkeTinder                     |");
        println("|___________________________________________________|");
    }

    static void menu(){
        println("|(1) - Listar Candidatos                            |");
        println("|(2) - Listar Empresas                              |");
        println("|(0) - sair                                         |");
        println("|___________________________________________________|");
    }
}

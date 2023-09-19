public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    private ReprodutorMusical itunes;
    private AparelhoTelefonico discador;
    private NavegadorInternet safari;

    public Iphone(ReprodutorMusical itunes, AparelhoTelefonico discador, NavegadorInternet safari) {
        this.itunes = itunes;
        this.discador = discador;
        this.safari = safari;
    }

    @Override
    public void tocar(String musica) {
        itunes.tocar(musica);
    }

    @Override
    public void pausar(boolean estado) {
        itunes.pausar(estado);
    }

    @Override
    public void selecionaMusica(String musica) {
        itunes.selecionaMusica(musica);
    }

    @Override
    public void ligar(int numero) {
        discador.ligar(numero);
    }

    @Override
    public void atender(boolean ligacao) {
        if (ligacao) {
            System.out.println("Atendendo Ligação");
            itunes.pausar(true);
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        discador.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        safari.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        safari.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        safari.atualizarPagina();
    }

    public static void main(String[] args) {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
        NavegadorInternet navegadorInternet = new NavegadorInternetImpl();

        Iphone meuIphone = new Iphone(reprodutorMusical, aparelhoTelefonico, navegadorInternet);

        // Simulando ações e imprimindo mensagens no terminal
        System.out.println("Iniciando música no Iphone");
        meuIphone.tocar("Minha Música");

        System.out.println("Pausando música no Iphone");
        meuIphone.pausar(true);

        System.out.println("Selecionando a música 'Mirrorball' no Iphone");
        meuIphone.selecionaMusica("Mirrorball");

        System.out.println("Ligando para 123456789 no Iphone");
        meuIphone.ligar(123456789);

        System.out.println("Chamada atendida no Iphone");
        meuIphone.atender(true);

        System.out.println("Iniciando correio de voz no Iphone");
        meuIphone.iniciarCorreioVoz();

        System.out.println("Exibindo a página https://www.exemplo.com no Safari do Iphone");
        meuIphone.exibirPagina("https://www.exemplo.com");

        System.out.println("Adicionando uma nova aba no Safari do Iphone");
        meuIphone.adicionarNovaAba();

        System.out.println("Atualizando a página no Safari do Iphone");
        meuIphone.atualizarPagina();
    }
}

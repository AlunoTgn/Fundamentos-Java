
public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Física fis = new Física();
		fis.nome = "JOÃO";
		fis.cpf = "1111111";
		fis.identidade = "1560455";
		fis.situacaoPessoa = "A";

		Juridica jur = new Juridica();
		jur.nome = "CASAS DO SILVA";
		jur.cnpj = "454577566";
		jur.inscEstadual = "45545454";
		jur.situacaoPessoa = "I";
		
		System.out.println("Dados da Pessoa Física");
		System.out.println(fis.toString());
		
		System.out.println("Dados da Pessoa Jurídica");
		System.out.println(jur.toString());
		

	}

}

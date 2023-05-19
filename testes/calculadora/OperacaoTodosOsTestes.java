package calculadora;




import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@ExtendWith(SuiteExtension.class)
@Suite
@SelectClasses({ OperacaoTest_Soma.class, OperacaoTest_Subtracao.class, OperacaoTest_Divisao.class, OperacaoTest_Multiplicacao.class })

class OperacaoTodosOsTestes {
	
	 
	

}

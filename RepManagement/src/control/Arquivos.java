/*
* Código de projeto de Programação Orientada a Objetos II
* Gerenciamento do financeiro de republicas
* FT-UNICAMP
*
*/
package control;

import java.nio.file.Path;
import java.util.ArrayList;
/**
 *
 * @author kelwin
 */
public interface Arquivos {
    abstract String ArquivoNome();
    abstract String DiretorioNome();
    public abstract <T> ArrayList<T> LoadAll();
    public abstract <T> T Load(String f);
    public void Save();
    public void Remove();
}

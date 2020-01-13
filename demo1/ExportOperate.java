package design.demo1;

/**
 * 导出操作抽象类 --- creater
 */
public abstract class ExportOperate {
    public abstract ExportFileApi factoryMethod();
    public boolean export(String data){
        return factoryMethod().export(data);
    }
}

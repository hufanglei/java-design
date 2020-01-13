package design.demo1;

/**
 * 导出文件操作类 --- concreteCreator
 */
public class ExportTxtFileOperate extends ExportOperate {
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}

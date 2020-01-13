package design.demo1;

public class ExportDBFileOperate extends ExportOperate {
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportDbFile();
    }
}

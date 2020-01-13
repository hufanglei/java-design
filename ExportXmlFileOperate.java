package design;//package design;

/**
 * 导出文件操作类 --- concreteCreator
 */
public class ExportXmlFileOperate extends ExportOperate {
    public ExportFileApi factoryMethod(int type) {
        ExportFileApi api = null;
        if(type == 3){
            api = new ExportXmlFile();
        }else{
            api = super.factoryMethod(type);
        }
        return api;
    }
}

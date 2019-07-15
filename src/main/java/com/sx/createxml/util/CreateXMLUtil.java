package com.sx.createxml.util;

import com.sx.createxml.pojo.CreateXMLResult;
import com.sx.createxml.pojo.XMLDataStruct.ActionMetaItem;
import com.sx.createxml.pojo.XMLDataStruct.PrintWithItem;
import com.sx.createxml.pojo.mysql.MetaItem;
import org.springframework.util.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 16:42
 */
public class CreateXMLUtil {
    public static ArrayList<CreateXMLResult> createXMLByDOM(String destFolerPath, List<PrintWithItem> prints) {
        // 创建DocumentBuilderFactory
        ArrayList<CreateXMLResult> listResult = new ArrayList<>();
        for (int j = 0; j < prints.size(); j++) {
            PrintWithItem printWithItem = prints.get(j);
            List<MetaItem> items = printWithItem.getItems();
            List<ActionMetaItem> actionMetaItems = printWithItem.getActionMetaItems();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            try {

                // 创建DocumentBuilder
                DocumentBuilder builder = factory.newDocumentBuilder();

                // 创建Document
                Document document = builder.newDocument();

                // 设置XML声明中standalone为yes，即没有dtd和schema作为该XML的说明文档，且不显示该属性
                // document.setXmlStandalone(true);

                // 创建根节点
                Element root = document.createElement("root");

                for (int i = 0; i < items.size(); i++) {
//                   File dest_path =  new File("./xmls/"+Items.get(i).getName());


                    // 创建子节点，并设置属性
                    Element metaItem = document.createElement("metaItem");
                    //book.setAttribute("id", "1");

                    // 为book添加子节点
                    Element name = document.createElement("name");
                    String name1 = items.get(i).getName();
                    if (StringUtils.isEmpty(name1)) {
                        name1 = "null";
                    }
                    name.setTextContent(name1);
                    metaItem.appendChild(name);

                    Element key = document.createElement("key");
                    String key1 = items.get(i).getKey();
                    if (StringUtils.isEmpty(key1)) {
                        key1 = "null";
                    }
                    key.setTextContent(key1);
                    metaItem.appendChild(key);


                    Element type = document.createElement("type");
                    String type1 = items.get(i).getType();
                    if (StringUtils.isEmpty(type1)) {
                        type1 = "null";
                    }
                    type.setTextContent(type1);
                    metaItem.appendChild(type);


                    Element length = document.createElement("length");
                    String length1 = items.get(i).getLength();
                    if (StringUtils.isEmpty(length1)) {
                        length1 = "null";
                    }
                    length.setTextContent(length1);
                    metaItem.appendChild(length);

                    Element source = document.createElement("source");
                    String source1 = items.get(i).getSource();
                    if (StringUtils.isEmpty(source1)) {
                        source1 = "null";
                    }
                    source.setTextContent(source1);
                    metaItem.appendChild(source);

                    Element unique = document.createElement("unique");
                    String unique1 = items.get(i).getUnique();
                    if (StringUtils.isEmpty(unique1)) {
                        unique1 = "null";
                    }
                    unique.setTextContent(unique1);
                    metaItem.appendChild(unique);

                    Element constrain = document.createElement("constrain");
                    String constrain1 = items.get(i).getConstrain();
                    if (StringUtils.isEmpty(constrain1)) {
                        constrain1 = "null";
                    }
                    constrain.setTextContent(constrain1);
                    metaItem.appendChild(constrain);

                    Element node = document.createElement("node");
                    String node1 = items.get(i).getNode();
                    if (StringUtils.isEmpty(node1)) {
                        node1 = "null";

                    }
                    node.setTextContent(node1);
                    metaItem.appendChild(node);

                    Element method = document.createElement("method");
                    String method1 = items.get(i).getMethod();
                    if (StringUtils.isEmpty(method1)) {
                        method1 = "null";
                    }
                    method.setTextContent(method1);
                    metaItem.appendChild(method);

                    Element range = document.createElement("range");
                    String range1 = items.get(i).getRange();
                    if (StringUtils.isEmpty(range1)) {
                        range1 = "null";
                    }
                    range.setTextContent(range1);
                    metaItem.appendChild(range);


                    Element notation = document.createElement("notation");
                    String notation1 = items.get(i).getNotation();
                    if (StringUtils.isEmpty(notation1)) {
                        notation1 = "null";

                    }
                    notation.setTextContent(notation1);
                    metaItem.appendChild(notation);

                    Element value = document.createElement("value");
                    String value1 = items.get(i).getValue();
                    if (StringUtils.isEmpty(value1)) {
                        value1 = "null";
                    }
                    value.setTextContent(value1);
                    metaItem.appendChild(value);


                    // 为根节点添加子节点
                    root.appendChild(metaItem);
                }

                Element logs = document.createElement("logs");
                //book.setAttribute("id", "1");

                // TODO 每一个item需要一个循环
                if(actionMetaItems!=null) {
                    for (int k = 0; k < actionMetaItems.size(); k++) {
                        Element item = document.createElement("item");

                        Element opttype = document.createElement("opttype");
                        String opttype1 = actionMetaItems.get(k).getActionType();
                        if (StringUtils.isEmpty(opttype1)) {
                            opttype1 = "null";
                        }
                        opttype.setTextContent(opttype1);
                        item.appendChild(opttype);

                        Element duty = document.createElement("duty");
                        String duty1 = actionMetaItems.get(k).getChargePersonPosition();
                        if (StringUtils.isEmpty(duty1)) {
                            duty1 = "null";
                        }
                        duty.setTextContent(duty1);
                        item.appendChild(duty);

                        Element author = document.createElement("author");
                        String author1 = actionMetaItems.get(k).getChargePersonName();
                        if (StringUtils.isEmpty(author1)) {
                            author1 = "null";
                        }
                        author.setTextContent(author1);
                        item.appendChild(author);

                        Element optIP = document.createElement("optIP");
                        String optIP1 = actionMetaItems.get(k).getChargePersonIp();
                        if (StringUtils.isEmpty(optIP1)) {
                            optIP1 = "null";
                        }
                        optIP.setTextContent(optIP1);
                        item.appendChild(optIP);

                        Element createtime = document.createElement("createtime");
                        String createtime1 = actionMetaItems.get(k).getProcessOccurrenceTime();
                        if (StringUtils.isEmpty(createtime1)) {
                            createtime1 = "null";
                        }
                        createtime.setTextContent(createtime1);
                        item.appendChild(createtime);

                        Element optnumber = document.createElement("optnumber");
                        String optnumber1 = actionMetaItems.get(k).getProcessOrder();
                        if (StringUtils.isEmpty(optnumber1)) {
                            optnumber1 = "null";
                        }
                        optnumber.setTextContent(optnumber1);
                        item.appendChild(optnumber);

                        Element remark = document.createElement("remark");
                        String remark1 = actionMetaItems.get(k).getProcessingState();
                        if (StringUtils.isEmpty(remark1)) {
                            remark1 = "null";
                        }
                        remark.setTextContent(remark1);
                        item.appendChild(remark);

                        logs.appendChild(item);
                    }
                }else {
                    logs.setTextContent("null");

                }
                root.appendChild(logs);


                // 将根节点添加到Document下
                document.appendChild(root);

                /*
                 * 下面开始实现： 生成XML文件
                 */

                // 创建TransformerFactory对象
                TransformerFactory tff = TransformerFactory.newInstance();

                // 创建Transformer对象
                Transformer tf = tff.newTransformer();

                // 设置输出数据时换行
                tf.setOutputProperty(OutputKeys.INDENT, "yes");
                //TODO 如果文件夹不存在 要创建       文件路径再学习
                //创建文件的传输路径
                if (StringUtils.isEmpty(destFolerPath)) {
                    destFolerPath = "xmls/";
                }
                //创建路径不要用中文
                String createPath = destFolerPath + printWithItem.getPrintId() + ".xml";

                File dest = new File(createPath);
                // 使用Transformer的transform()方法将DOM树转换成XML
                tf.transform(new DOMSource(document), new StreamResult(dest));

                CreateXMLResult createXMLResult = new CreateXMLResult();
                createXMLResult.setCreatePath(createPath);

                createXMLResult.setPrintId(printWithItem.getPrintId());
                listResult.add(createXMLResult);

            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerConfigurationException e) {
                e.printStackTrace();
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        }

        return listResult;
    }
}
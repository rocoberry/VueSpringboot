/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package seu.wh.seuwh_mstc.dao.DaoProvider;

import seu.wh.seuwh_mstc.model.ArticleTag;

import java.text.MessageFormat;
import java.util.List;

public class ArticleTagDaoProvider {
    public String addArticleTagBatch(List<ArticleTag> list){
        StringBuilder sb=new StringBuilder();
        sb.append("insert into articletag ");
        sb.append("(articleid,tagid,tagdescription) ");
        sb.append("values ");
        MessageFormat mf=new MessageFormat(" #'{' list[{0}].articleid},#'{'list[{0}].tagid},#'{'list[{0}].tagdescription}");
        for(int i=0;i<list.size();i++) {
            sb.append("(");
            String str = mf.format(new Object[]{i});
            sb.append(str);
            sb.append(")");
            if(i<list.size()-1){
                sb.append(",");
            }

        }
        return sb.toString();
    }
}

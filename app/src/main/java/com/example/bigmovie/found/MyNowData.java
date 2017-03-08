package com.example.bigmovie.found;

import java.util.List;

/**
 * Created by 且以白首共余生。 on 2017/3/2.
 */
public class MyNowData {

    @Override
    public String toString() {
        return "MyNowData{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"f1ff6e7a09a72db57334cfc7b442d54b","title":"情人节表白遭拒 小伙高速上逆行后躺地大哭","date":"2017-03-02 12:33","category":"社会","author_name":"新民网","url":"http://mini.eastday.com/mobile/170302123333422.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_2_mwpm_03200403.jpeg"},{"uniquekey":"7daacd9a981296ababe0c16a46645c93","title":"围观吵架遭骂\u201c老不死\u201d  94岁老太\u201c混战\u201d中被气倒过世","date":"2017-03-02 12:43","category":"社会","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170302124359825.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170302/20170302124359_8b74c873833f95a5a8dca2647c6526c9_1_mwpm_03200403.jpg"},{"uniquekey":"5c81f2a525869a42b11dd7af1464be77","title":"\u201c2016年上海志愿服务发展新情况\u201d发布 市民满意率93.3%","date":"2017-03-02 12:40","category":"社会","author_name":"新民晚报","url":"http://mini.eastday.com/mobile/170302124007314.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302124007_a2d76407bfa413df930a31ff2be3cef0_1_mwpm_03200403.jpeg"},{"uniquekey":"374059ebef921098857e3abfdb29279c","title":"浙江常山\u201c洋教师\u201d：跨万里传技艺 怀初心栽桃李","date":"2017-03-02 12:39","category":"社会","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170302123951520.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302123951_10949994b7c29d853a143933e87f0a09_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170302/20170302123951_10949994b7c29d853a143933e87f0a09_2_mwpm_03200403.jpeg"},{"uniquekey":"98e435d5ee7abe5a1870603f25f9414d","title":"天津坠童事件引关注 记者实测南京多家商场护栏","date":"2017-03-02 12:36","category":"社会","author_name":"金陵晚报","url":"http://mini.eastday.com/mobile/170302123628449.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170302/20170302123628_47752146e662e67bec52b6657e5f7fa0_1_mwpm_03200403.jpeg"},{"uniquekey":"007643dd6fa496e8c68623b47c429709","title":"猕猴桃敲开致富门 四川巴中\u201c光棍村\u201d变\u201c示范村\u201d","date":"2017-03-02 12:36","category":"社会","author_name":"人民网","url":"http://mini.eastday.com/mobile/170302123617246.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302123617_e86929a05d05697be7f38207fca0414e_1_mwpm_03200403.jpeg"},{"uniquekey":"2de4c6b3c0e61388fa54f2e0c3d39a52","title":"智斗假冒警察，苦劝受骗妇女，湘潭公安拼力保住5万元血汗钱\u2026\u2026","date":"2017-03-02 12:32","category":"社会","author_name":"湖南公安在线","url":"http://mini.eastday.com/mobile/170302123226803.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302123226_7abd906996a7b4ba329f0c51ced9dee9_1_mwpm_03200403.jpeg"},{"uniquekey":"6bc56ba7145ffde91dfcc19e08646b58","title":"多年的解释功亏一篑：内蒙古小学生真是骑马上学的","date":"2017-03-02 12:31","category":"社会","author_name":"华俊竹","url":"http://mini.eastday.com/mobile/170302123133270.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302_3baec59f30fdc74f369d2b16377ce9dc_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302_27ed75bff8d1fefffc8cedb069b0040b_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170302/20170302_f6bd1aaf68ec03f6c85c7ea96de5d0b9_cover_mwpm_03200403.jpeg"},{"uniquekey":"cbd7fe571bb949ecd7874ef1a2cba812","title":"护工殴打病人?北京航天总院:打人者系患者女儿","date":"2017-03-02 12:24","category":"社会","author_name":"北京时间","url":"http://mini.eastday.com/mobile/170302122445238.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302122445_afc28647a62d75c7524cf1a27d117969_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302122445_afc28647a62d75c7524cf1a27d117969_2_mwpm_03200403.png"},{"uniquekey":"f289404353f1ee5eea09455009582184","title":"女子捡到LV包原物归还 反被失主索要打车费","date":"2017-03-02 12:23","category":"社会","author_name":"半岛晨报","url":"http://mini.eastday.com/mobile/170302122323335.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302122323_ea275dd0ce01f53250963265c836eecf_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170302/20170302122323_ea275dd0ce01f53250963265c836eecf_2_mwpm_03200403.jpeg"},{"uniquekey":"d5c7247e27fa552ac95c6e17871357b2","title":"北京，我想离开了","date":"2017-03-02 12:21","category":"社会","author_name":"叫咖啡的高先森","url":"http://mini.eastday.com/mobile/170302122159517.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170302/20170302122159_54c806bdeda7189c73bf609e72aec5f2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170302/20170302122159_54c806bdeda7189c73bf609e72aec5f2_2_mwpm_03200403.jpeg"},{"uniquekey":"bbd619304aa6f108360d3dba7cf53706","title":"空中盘旋着的翅膀似花朵似的美丽的彩色蜂鸟","date":"2017-03-02 12:21","category":"社会","author_name":"蓝色畅想","url":"http://mini.eastday.com/mobile/170302122138050.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170302/20170302_802931c76838787f5146949201dd01df_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170302/20170302_eef8bfef84161f67eb02145acaacb0ae_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170302/20170302_eeee8e1c15ba71cc82f5928f080aefcc_mwpm_03200403.jpg"},{"uniquekey":"5f20ed50f1f365effec69696706f449e","title":"荷兰99岁老人想体验被捕入狱 警察帮其圆梦","date":"2017-03-02 12:21","category":"社会","author_name":"中国青年网","url":"http://mini.eastday.com/mobile/170302122113141.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302122113_3c84828b2e0940087de484915d272201_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170302/20170302122113_3c84828b2e0940087de484915d272201_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170302/20170302122113_3c84828b2e0940087de484915d272201_3_mwpm_03200403.jpeg"},{"uniquekey":"ec05b6e4bc5bc78e012718223daf7fcd","title":"丛林中有一座神奇的房子 你能找到么","date":"2017-03-02 12:13","category":"社会","author_name":"环球新闻","url":"http://mini.eastday.com/mobile/170302121303397.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170302/20170302121303_60231c84312f12e0ab24df4768617459_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170302/20170302121303_60231c84312f12e0ab24df4768617459_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170302/20170302121303_60231c84312f12e0ab24df4768617459_3_mwpm_03200403.jpeg"},{"uniquekey":"09ac705b093947ee0bd419e70c6d3c35","title":"\u201c建行公益·有你最美\u201d大型展示活动在京举办","date":"2017-03-02 12:11","category":"社会","author_name":"凤凰公益","url":"http://mini.eastday.com/mobile/170302121148861.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302121148_5d712f942a3fc722007676b1aaaf6cf8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302121148_5d712f942a3fc722007676b1aaaf6cf8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302121148_5d712f942a3fc722007676b1aaaf6cf8_3_mwpm_03200403.jpeg"},{"uniquekey":"0407a7497ed83e6609b9d555ee035de1","title":"2017年全国\u201c两会\u201d：记者领取采访证件","date":"2017-03-02 12:11","category":"社会","author_name":"中国西藏网","url":"http://mini.eastday.com/mobile/170302121103467.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170302/20170302121103_744e4096a4987129e914b35af84019b0_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170302/20170302121103_744e4096a4987129e914b35af84019b0_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170302/20170302121103_744e4096a4987129e914b35af84019b0_3_mwpm_03200403.jpeg"},{"uniquekey":"b4282bee396825ff94e03a2dee6ffb0d","title":"陇南男子强奸诈骗女网友8万元，终被抓获！","date":"2017-03-02 12:07","category":"社会","author_name":"新甘肃","url":"http://mini.eastday.com/mobile/170302120744608.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302120744_1a644747c8e4440737e7cb5f6376547e_1_mwpm_03200403.jpeg"},{"uniquekey":"87e5b057ff992bcc1a9c440cf1b0b1fd","title":"九地名入围湖北\u201c最美地名\u201d","date":"2017-03-02 12:07","category":"社会","author_name":"汉江网-襄阳晚报","url":"http://mini.eastday.com/mobile/170302120712252.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302120712_2bc935b4bb6b7aeeb0625963fe07217d_1_mwpm_03200403.jpeg"},{"uniquekey":"dc12cefac203cf8761aae973df700758","title":"襄阳父子同签遗体捐献协议","date":"2017-03-02 12:07","category":"社会","author_name":"汉江网-襄阳晚报","url":"http://mini.eastday.com/mobile/170302120711589.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302120711_cbdd9a951d328ef7818b527b986ea677_1_mwpm_03200403.jpeg"},{"uniquekey":"b76d5a2f380b7321d6fb2a57e9b7fed1","title":"卫龙：已陆续下架所有在乐天商品 今后不再与乐天合作！","date":"2017-03-02 11:57","category":"社会","author_name":"拉呱","url":"http://mini.eastday.com/mobile/170302115747991.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302_9fb2170873b5e02c3e438c20e9153b97_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302_5b1bd82fec3f88ebce8050a1e0ae20f6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302_2ad2e5ce32aceb07bef7ac328704a365_mwpm_03200403.jpg"},{"uniquekey":"7e95d73cde654f2db7153c39dfac8bae","title":"集体过生日","date":"2017-03-02 11:57","category":"社会","author_name":"新疆经济报","url":"http://mini.eastday.com/mobile/170302115700885.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302115700_79285d8cc78375bab200116ce9734521_1_mwpm_03200403.jpeg"},{"uniquekey":"e0cfbbee5d0905a8277aadfceece0a82","title":"天水市水务局局长汪杰刚调研关峡水库建设工作","date":"2017-03-02 11:52","category":"社会","author_name":"秦州区水务局","url":"http://mini.eastday.com/mobile/170302115254730.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170302/20170302115254_27cab48a0dfbb9418ddef358a45c1f8e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170302/20170302115254_27cab48a0dfbb9418ddef358a45c1f8e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170302/20170302115254_27cab48a0dfbb9418ddef358a45c1f8e_3_mwpm_03200403.jpeg"},{"uniquekey":"43f717b5a8250446983331943fe65a15","title":"2岁女童玩钢卷尺 两根手指被严重割伤","date":"2017-03-02 11:51","category":"社会","author_name":"佛山在线","url":"http://mini.eastday.com/mobile/170302115120387.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302115120_66243ea28bdcc089a58c366f31afda4f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302115120_66243ea28bdcc089a58c366f31afda4f_2_mwpm_03200403.jpeg"},{"uniquekey":"4d0b0a84fd9a0735ea3bee0f0e040f87","title":"关门搞研究 开门去创业 上海张江众创空间吸引无数人才","date":"2017-03-02 11:48","category":"社会","author_name":"新民晚报","url":"http://mini.eastday.com/mobile/170302114805336.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170302/20170302114805_3960f09fde1d53d25b8016c80a26e55e_1_mwpm_03200403.jpeg"},{"uniquekey":"5eade4cddec29a4fa7c90f31886656ed","title":"滴水映出巡天日 丰田村头话团结","date":"2017-03-02 11:46","category":"社会","author_name":"新疆日报","url":"http://mini.eastday.com/mobile/170302114654590.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302114654_ba3e947dde96f6800c370c9a1218bf5f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302114654_ba3e947dde96f6800c370c9a1218bf5f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302114654_ba3e947dde96f6800c370c9a1218bf5f_3_mwpm_03200403.jpeg"},{"uniquekey":"7ed3d10b2754dab27c528799f303a13b","title":"聚贤盛邦集团世界企业家韶山行","date":"2017-03-02 11:46","category":"社会","author_name":"天阅网","url":"http://mini.eastday.com/mobile/170302114619789.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302_1efbe74265b28846aab4682ebb36f20a_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302_93f45df58d90738b4c7794b306b7602f_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302_78a49d5d9b719e6554abcfa22cb44989_cover_mwpm_03200403.png"},{"uniquekey":"f90bddc7588ed24fa5d350d1ac6c5817","title":"团伙盗车街头竞逐飙车 霞浦警方打掉7人盗窃团伙","date":"2017-03-02 11:43","category":"社会","author_name":"大宁网","url":"http://mini.eastday.com/mobile/170302114345407.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170302/20170302114345_5907e1ed28843975440002fbe547861c_1_mwpm_03200403.jpeg"},{"uniquekey":"5040800282bf0e6118e1bda4d9e9ea9f","title":"天水：王志军调研督查监所管理和信访维稳工作","date":"2017-03-02 11:42","category":"社会","author_name":"武山县委政法委","url":"http://mini.eastday.com/mobile/170302114246344.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302114246_d98ca8673e1c4ae45dc93de5fb114e77_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170302/20170302114246_d98ca8673e1c4ae45dc93de5fb114e77_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170302/20170302114246_d98ca8673e1c4ae45dc93de5fb114e77_3_mwpm_03200403.jpeg"},{"uniquekey":"c8347e37ed3bd0139f74d947355667d3","title":"【脱贫攻坚】天水清水:精准医疗助力精准扶贫攻坚战","date":"2017-03-02 11:42","category":"社会","author_name":"清水县委外宣办","url":"http://mini.eastday.com/mobile/170302114245848.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302114245_9edd88301c51c62c30f25ae534829e47_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302114245_9edd88301c51c62c30f25ae534829e47_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170302/20170302114245_9edd88301c51c62c30f25ae534829e47_3_mwpm_03200403.jpeg"},{"uniquekey":"6da60c41c8bae705aff994a9950eba67","title":"天水市委党校2017年春季学期第一期主体班开班","date":"2017-03-02 11:42","category":"社会","author_name":"天水在线　","url":"http://mini.eastday.com/mobile/170302114245496.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302114245_3bcd2d2d6400a46cf28df0e8869b4a05_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170302/20170302114245_3bcd2d2d6400a46cf28df0e8869b4a05_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170302/20170302114245_3bcd2d2d6400a46cf28df0e8869b4a05_3_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        /**
         * stat : 1
         * data : [{"uniquekey":"f1ff6e7a09a72db57334cfc7b442d54b","title":"情人节表白遭拒 小伙高速上逆行后躺地大哭","date":"2017-03-02 12:33","category":"社会","author_name":"新民网","url":"http://mini.eastday.com/mobile/170302123333422.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_2_mwpm_03200403.jpeg"},{"uniquekey":"7daacd9a981296ababe0c16a46645c93","title":"围观吵架遭骂\u201c老不死\u201d  94岁老太\u201c混战\u201d中被气倒过世","date":"2017-03-02 12:43","category":"社会","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170302124359825.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170302/20170302124359_8b74c873833f95a5a8dca2647c6526c9_1_mwpm_03200403.jpg"},{"uniquekey":"5c81f2a525869a42b11dd7af1464be77","title":"\u201c2016年上海志愿服务发展新情况\u201d发布 市民满意率93.3%","date":"2017-03-02 12:40","category":"社会","author_name":"新民晚报","url":"http://mini.eastday.com/mobile/170302124007314.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302124007_a2d76407bfa413df930a31ff2be3cef0_1_mwpm_03200403.jpeg"},{"uniquekey":"374059ebef921098857e3abfdb29279c","title":"浙江常山\u201c洋教师\u201d：跨万里传技艺 怀初心栽桃李","date":"2017-03-02 12:39","category":"社会","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170302123951520.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302123951_10949994b7c29d853a143933e87f0a09_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170302/20170302123951_10949994b7c29d853a143933e87f0a09_2_mwpm_03200403.jpeg"},{"uniquekey":"98e435d5ee7abe5a1870603f25f9414d","title":"天津坠童事件引关注 记者实测南京多家商场护栏","date":"2017-03-02 12:36","category":"社会","author_name":"金陵晚报","url":"http://mini.eastday.com/mobile/170302123628449.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170302/20170302123628_47752146e662e67bec52b6657e5f7fa0_1_mwpm_03200403.jpeg"},{"uniquekey":"007643dd6fa496e8c68623b47c429709","title":"猕猴桃敲开致富门 四川巴中\u201c光棍村\u201d变\u201c示范村\u201d","date":"2017-03-02 12:36","category":"社会","author_name":"人民网","url":"http://mini.eastday.com/mobile/170302123617246.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302123617_e86929a05d05697be7f38207fca0414e_1_mwpm_03200403.jpeg"},{"uniquekey":"2de4c6b3c0e61388fa54f2e0c3d39a52","title":"智斗假冒警察，苦劝受骗妇女，湘潭公安拼力保住5万元血汗钱\u2026\u2026","date":"2017-03-02 12:32","category":"社会","author_name":"湖南公安在线","url":"http://mini.eastday.com/mobile/170302123226803.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302123226_7abd906996a7b4ba329f0c51ced9dee9_1_mwpm_03200403.jpeg"},{"uniquekey":"6bc56ba7145ffde91dfcc19e08646b58","title":"多年的解释功亏一篑：内蒙古小学生真是骑马上学的","date":"2017-03-02 12:31","category":"社会","author_name":"华俊竹","url":"http://mini.eastday.com/mobile/170302123133270.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302_3baec59f30fdc74f369d2b16377ce9dc_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302_27ed75bff8d1fefffc8cedb069b0040b_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170302/20170302_f6bd1aaf68ec03f6c85c7ea96de5d0b9_cover_mwpm_03200403.jpeg"},{"uniquekey":"cbd7fe571bb949ecd7874ef1a2cba812","title":"护工殴打病人?北京航天总院:打人者系患者女儿","date":"2017-03-02 12:24","category":"社会","author_name":"北京时间","url":"http://mini.eastday.com/mobile/170302122445238.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302122445_afc28647a62d75c7524cf1a27d117969_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302122445_afc28647a62d75c7524cf1a27d117969_2_mwpm_03200403.png"},{"uniquekey":"f289404353f1ee5eea09455009582184","title":"女子捡到LV包原物归还 反被失主索要打车费","date":"2017-03-02 12:23","category":"社会","author_name":"半岛晨报","url":"http://mini.eastday.com/mobile/170302122323335.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302122323_ea275dd0ce01f53250963265c836eecf_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170302/20170302122323_ea275dd0ce01f53250963265c836eecf_2_mwpm_03200403.jpeg"},{"uniquekey":"d5c7247e27fa552ac95c6e17871357b2","title":"北京，我想离开了","date":"2017-03-02 12:21","category":"社会","author_name":"叫咖啡的高先森","url":"http://mini.eastday.com/mobile/170302122159517.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170302/20170302122159_54c806bdeda7189c73bf609e72aec5f2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170302/20170302122159_54c806bdeda7189c73bf609e72aec5f2_2_mwpm_03200403.jpeg"},{"uniquekey":"bbd619304aa6f108360d3dba7cf53706","title":"空中盘旋着的翅膀似花朵似的美丽的彩色蜂鸟","date":"2017-03-02 12:21","category":"社会","author_name":"蓝色畅想","url":"http://mini.eastday.com/mobile/170302122138050.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170302/20170302_802931c76838787f5146949201dd01df_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170302/20170302_eef8bfef84161f67eb02145acaacb0ae_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170302/20170302_eeee8e1c15ba71cc82f5928f080aefcc_mwpm_03200403.jpg"},{"uniquekey":"5f20ed50f1f365effec69696706f449e","title":"荷兰99岁老人想体验被捕入狱 警察帮其圆梦","date":"2017-03-02 12:21","category":"社会","author_name":"中国青年网","url":"http://mini.eastday.com/mobile/170302122113141.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302122113_3c84828b2e0940087de484915d272201_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170302/20170302122113_3c84828b2e0940087de484915d272201_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170302/20170302122113_3c84828b2e0940087de484915d272201_3_mwpm_03200403.jpeg"},{"uniquekey":"ec05b6e4bc5bc78e012718223daf7fcd","title":"丛林中有一座神奇的房子 你能找到么","date":"2017-03-02 12:13","category":"社会","author_name":"环球新闻","url":"http://mini.eastday.com/mobile/170302121303397.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170302/20170302121303_60231c84312f12e0ab24df4768617459_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170302/20170302121303_60231c84312f12e0ab24df4768617459_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170302/20170302121303_60231c84312f12e0ab24df4768617459_3_mwpm_03200403.jpeg"},{"uniquekey":"09ac705b093947ee0bd419e70c6d3c35","title":"\u201c建行公益·有你最美\u201d大型展示活动在京举办","date":"2017-03-02 12:11","category":"社会","author_name":"凤凰公益","url":"http://mini.eastday.com/mobile/170302121148861.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302121148_5d712f942a3fc722007676b1aaaf6cf8_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302121148_5d712f942a3fc722007676b1aaaf6cf8_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302121148_5d712f942a3fc722007676b1aaaf6cf8_3_mwpm_03200403.jpeg"},{"uniquekey":"0407a7497ed83e6609b9d555ee035de1","title":"2017年全国\u201c两会\u201d：记者领取采访证件","date":"2017-03-02 12:11","category":"社会","author_name":"中国西藏网","url":"http://mini.eastday.com/mobile/170302121103467.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170302/20170302121103_744e4096a4987129e914b35af84019b0_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170302/20170302121103_744e4096a4987129e914b35af84019b0_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170302/20170302121103_744e4096a4987129e914b35af84019b0_3_mwpm_03200403.jpeg"},{"uniquekey":"b4282bee396825ff94e03a2dee6ffb0d","title":"陇南男子强奸诈骗女网友8万元，终被抓获！","date":"2017-03-02 12:07","category":"社会","author_name":"新甘肃","url":"http://mini.eastday.com/mobile/170302120744608.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302120744_1a644747c8e4440737e7cb5f6376547e_1_mwpm_03200403.jpeg"},{"uniquekey":"87e5b057ff992bcc1a9c440cf1b0b1fd","title":"九地名入围湖北\u201c最美地名\u201d","date":"2017-03-02 12:07","category":"社会","author_name":"汉江网-襄阳晚报","url":"http://mini.eastday.com/mobile/170302120712252.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302120712_2bc935b4bb6b7aeeb0625963fe07217d_1_mwpm_03200403.jpeg"},{"uniquekey":"dc12cefac203cf8761aae973df700758","title":"襄阳父子同签遗体捐献协议","date":"2017-03-02 12:07","category":"社会","author_name":"汉江网-襄阳晚报","url":"http://mini.eastday.com/mobile/170302120711589.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302120711_cbdd9a951d328ef7818b527b986ea677_1_mwpm_03200403.jpeg"},{"uniquekey":"b76d5a2f380b7321d6fb2a57e9b7fed1","title":"卫龙：已陆续下架所有在乐天商品 今后不再与乐天合作！","date":"2017-03-02 11:57","category":"社会","author_name":"拉呱","url":"http://mini.eastday.com/mobile/170302115747991.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302_9fb2170873b5e02c3e438c20e9153b97_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302_5b1bd82fec3f88ebce8050a1e0ae20f6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302_2ad2e5ce32aceb07bef7ac328704a365_mwpm_03200403.jpg"},{"uniquekey":"7e95d73cde654f2db7153c39dfac8bae","title":"集体过生日","date":"2017-03-02 11:57","category":"社会","author_name":"新疆经济报","url":"http://mini.eastday.com/mobile/170302115700885.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302115700_79285d8cc78375bab200116ce9734521_1_mwpm_03200403.jpeg"},{"uniquekey":"e0cfbbee5d0905a8277aadfceece0a82","title":"天水市水务局局长汪杰刚调研关峡水库建设工作","date":"2017-03-02 11:52","category":"社会","author_name":"秦州区水务局","url":"http://mini.eastday.com/mobile/170302115254730.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170302/20170302115254_27cab48a0dfbb9418ddef358a45c1f8e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170302/20170302115254_27cab48a0dfbb9418ddef358a45c1f8e_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170302/20170302115254_27cab48a0dfbb9418ddef358a45c1f8e_3_mwpm_03200403.jpeg"},{"uniquekey":"43f717b5a8250446983331943fe65a15","title":"2岁女童玩钢卷尺 两根手指被严重割伤","date":"2017-03-02 11:51","category":"社会","author_name":"佛山在线","url":"http://mini.eastday.com/mobile/170302115120387.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302115120_66243ea28bdcc089a58c366f31afda4f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302115120_66243ea28bdcc089a58c366f31afda4f_2_mwpm_03200403.jpeg"},{"uniquekey":"4d0b0a84fd9a0735ea3bee0f0e040f87","title":"关门搞研究 开门去创业 上海张江众创空间吸引无数人才","date":"2017-03-02 11:48","category":"社会","author_name":"新民晚报","url":"http://mini.eastday.com/mobile/170302114805336.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170302/20170302114805_3960f09fde1d53d25b8016c80a26e55e_1_mwpm_03200403.jpeg"},{"uniquekey":"5eade4cddec29a4fa7c90f31886656ed","title":"滴水映出巡天日 丰田村头话团结","date":"2017-03-02 11:46","category":"社会","author_name":"新疆日报","url":"http://mini.eastday.com/mobile/170302114654590.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302114654_ba3e947dde96f6800c370c9a1218bf5f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302114654_ba3e947dde96f6800c370c9a1218bf5f_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302114654_ba3e947dde96f6800c370c9a1218bf5f_3_mwpm_03200403.jpeg"},{"uniquekey":"7ed3d10b2754dab27c528799f303a13b","title":"聚贤盛邦集团世界企业家韶山行","date":"2017-03-02 11:46","category":"社会","author_name":"天阅网","url":"http://mini.eastday.com/mobile/170302114619789.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170302/20170302_1efbe74265b28846aab4682ebb36f20a_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170302/20170302_93f45df58d90738b4c7794b306b7602f_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170302/20170302_78a49d5d9b719e6554abcfa22cb44989_cover_mwpm_03200403.png"},{"uniquekey":"f90bddc7588ed24fa5d350d1ac6c5817","title":"团伙盗车街头竞逐飙车 霞浦警方打掉7人盗窃团伙","date":"2017-03-02 11:43","category":"社会","author_name":"大宁网","url":"http://mini.eastday.com/mobile/170302114345407.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170302/20170302114345_5907e1ed28843975440002fbe547861c_1_mwpm_03200403.jpeg"},{"uniquekey":"5040800282bf0e6118e1bda4d9e9ea9f","title":"天水：王志军调研督查监所管理和信访维稳工作","date":"2017-03-02 11:42","category":"社会","author_name":"武山县委政法委","url":"http://mini.eastday.com/mobile/170302114246344.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170302/20170302114246_d98ca8673e1c4ae45dc93de5fb114e77_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170302/20170302114246_d98ca8673e1c4ae45dc93de5fb114e77_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170302/20170302114246_d98ca8673e1c4ae45dc93de5fb114e77_3_mwpm_03200403.jpeg"},{"uniquekey":"c8347e37ed3bd0139f74d947355667d3","title":"【脱贫攻坚】天水清水:精准医疗助力精准扶贫攻坚战","date":"2017-03-02 11:42","category":"社会","author_name":"清水县委外宣办","url":"http://mini.eastday.com/mobile/170302114245848.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170302/20170302114245_9edd88301c51c62c30f25ae534829e47_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170302/20170302114245_9edd88301c51c62c30f25ae534829e47_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170302/20170302114245_9edd88301c51c62c30f25ae534829e47_3_mwpm_03200403.jpeg"},{"uniquekey":"6da60c41c8bae705aff994a9950eba67","title":"天水市委党校2017年春季学期第一期主体班开班","date":"2017-03-02 11:42","category":"社会","author_name":"天水在线　","url":"http://mini.eastday.com/mobile/170302114245496.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170302/20170302114245_3bcd2d2d6400a46cf28df0e8869b4a05_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170302/20170302114245_3bcd2d2d6400a46cf28df0e8869b4a05_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170302/20170302114245_3bcd2d2d6400a46cf28df0e8869b4a05_3_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : f1ff6e7a09a72db57334cfc7b442d54b
             * title : 情人节表白遭拒 小伙高速上逆行后躺地大哭
             * date : 2017-03-02 12:33
             * category : 社会
             * author_name : 新民网
             * url : http://mini.eastday.com/mobile/170302123333422.html
             * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_1_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20170302/20170302123333_18598fb49cc34f1c343849d3f9566566_2_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }
    }
}

package com.example.mystudyglide.dto;

import java.util.List;

public class ImageResponse {


    /**
     * total : 0
     * end : true
     * sid :
     * ran : 0
     * ras : 0
     * kn : 0
     * cn : 0
     * gn : 0
     * ps : 0
     * pc : 0
     * adstar : 0
     * lastindex : 0
     * ceg :
     * list : [{"id":"3c325d237b7eb69df70b37b632ec2bf7","qqface_down_url":false,"downurl":false,"downurl_true":"https://dl.image.so.com/d?imgurl=http%3A%2F%2Fimages.china.cn%2Fattachement%2Fjpg%2Fsite1000%2F20140202%2F001aa0ba48ab14576ff427.jpg&purl=http%3A%2F%2Fnews.china.com.cn%2F2014-02%2F02%2Fcontent_31363282.htm&key=7e844f95e5","grpmd5":false,"type":0,"src":"1","color":1024,"index":0,"title":"高清航拍北京除夕夜景","litetitle":"","width":"949","height":"634","imgsize":"166KB","imgtype":"JPEG","key":"7e844f95e5","dspurl":"news.china.com.cn","link":"http://news.china.com.cn/2014-02/02/content_31363282.htm","source":10,"img":"http://images.china.cn/attachement/jpg/site1000/20140202/001aa0ba48ab14576ff427.jpg","thumb_bak":"https://p2.ssl.qhimgs1.com/t01e038f1beb6185af2.jpg","thumb":"https://p2.ssl.qhimgs1.com/t01e038f1beb6185af2.jpg","_thumb_bak":"https://p2.ssl.qhimgs1.com/sdr/_240_/t01e038f1beb6185af2.jpg","_thumb":"https://p2.ssl.qhimgs1.com/sdr/_240_/t01e038f1beb6185af2.jpg","imgkey":"t01e038f1beb6185af2.jpg","thumbWidth":359,"dsptime":"","thumbHeight":240,"grpcnt":"0","fixedSize":false,"fnum":"0","comm_purl":""}]
     * boxresult : null
     * wordguess : null
     * prevsn : -1
     */

    private int total;
    private boolean end;
    private String sid;
    private int ran;
    private int ras;
    private int kn;
    private int cn;
    private int gn;
    private int ps;
    private int pc;
    private int adstar;
    private int lastindex;
    private String ceg;
    private Object boxresult;
    private Object wordguess;
    private int prevsn;
    private List<ListItemDto> list;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getRan() {
        return ran;
    }

    public void setRan(int ran) {
        this.ran = ran;
    }

    public int getRas() {
        return ras;
    }

    public void setRas(int ras) {
        this.ras = ras;
    }

    public int getKn() {
        return kn;
    }

    public void setKn(int kn) {
        this.kn = kn;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public int getGn() {
        return gn;
    }

    public void setGn(int gn) {
        this.gn = gn;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getAdstar() {
        return adstar;
    }

    public void setAdstar(int adstar) {
        this.adstar = adstar;
    }

    public int getLastindex() {
        return lastindex;
    }

    public void setLastindex(int lastindex) {
        this.lastindex = lastindex;
    }

    public String getCeg() {
        return ceg;
    }

    public void setCeg(String ceg) {
        this.ceg = ceg;
    }

    public Object getBoxresult() {
        return boxresult;
    }

    public void setBoxresult(Object boxresult) {
        this.boxresult = boxresult;
    }

    public Object getWordguess() {
        return wordguess;
    }

    public void setWordguess(Object wordguess) {
        this.wordguess = wordguess;
    }

    public int getPrevsn() {
        return prevsn;
    }

    public void setPrevsn(int prevsn) {
        this.prevsn = prevsn;
    }

    public List<ListItemDto> getList() {
        return list;
    }

    public void setList(List<ListItemDto> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * id : 3c325d237b7eb69df70b37b632ec2bf7
         * qqface_down_url : false
         * downurl : false
         * downurl_true : https://dl.image.so.com/d?imgurl=http%3A%2F%2Fimages.china.cn%2Fattachement%2Fjpg%2Fsite1000%2F20140202%2F001aa0ba48ab14576ff427.jpg&purl=http%3A%2F%2Fnews.china.com.cn%2F2014-02%2F02%2Fcontent_31363282.htm&key=7e844f95e5
         * grpmd5 : false
         * type : 0
         * src : 1
         * color : 1024
         * index : 0
         * title : 高清航拍北京除夕夜景
         * litetitle :
         * width : 949
         * height : 634
         * imgsize : 166KB
         * imgtype : JPEG
         * key : 7e844f95e5
         * dspurl : news.china.com.cn
         * link : http://news.china.com.cn/2014-02/02/content_31363282.htm
         * source : 10
         * img : http://images.china.cn/attachement/jpg/site1000/20140202/001aa0ba48ab14576ff427.jpg
         * thumb_bak : https://p2.ssl.qhimgs1.com/t01e038f1beb6185af2.jpg
         * thumb : https://p2.ssl.qhimgs1.com/t01e038f1beb6185af2.jpg
         * _thumb_bak : https://p2.ssl.qhimgs1.com/sdr/_240_/t01e038f1beb6185af2.jpg
         * _thumb : https://p2.ssl.qhimgs1.com/sdr/_240_/t01e038f1beb6185af2.jpg
         * imgkey : t01e038f1beb6185af2.jpg
         * thumbWidth : 359
         * dsptime :
         * thumbHeight : 240
         * grpcnt : 0
         * fixedSize : false
         * fnum : 0
         * comm_purl :
         */

        private String id;
        private boolean qqface_down_url;
        private boolean downurl;
        private String downurl_true;
        private boolean grpmd5;
        private int type;
        private String src;
        private int color;
        private int index;
        private String title;
        private String litetitle;
        private String width;
        private String height;
        private String imgsize;
        private String imgtype;
        private String key;
        private String dspurl;
        private String link;
        private int source;
        private String img;
        private String thumb_bak;
        private String thumb;
        private String _thumb_bak;
        private String _thumb;
        private String imgkey;
        private int thumbWidth;
        private String dsptime;
        private int thumbHeight;
        private String grpcnt;
        private boolean fixedSize;
        private String fnum;
        private String comm_purl;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean isQqface_down_url() {
            return qqface_down_url;
        }

        public void setQqface_down_url(boolean qqface_down_url) {
            this.qqface_down_url = qqface_down_url;
        }

        public boolean isDownurl() {
            return downurl;
        }

        public void setDownurl(boolean downurl) {
            this.downurl = downurl;
        }

        public String getDownurl_true() {
            return downurl_true;
        }

        public void setDownurl_true(String downurl_true) {
            this.downurl_true = downurl_true;
        }

        public boolean isGrpmd5() {
            return grpmd5;
        }

        public void setGrpmd5(boolean grpmd5) {
            this.grpmd5 = grpmd5;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLitetitle() {
            return litetitle;
        }

        public void setLitetitle(String litetitle) {
            this.litetitle = litetitle;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getImgsize() {
            return imgsize;
        }

        public void setImgsize(String imgsize) {
            this.imgsize = imgsize;
        }

        public String getImgtype() {
            return imgtype;
        }

        public void setImgtype(String imgtype) {
            this.imgtype = imgtype;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getDspurl() {
            return dspurl;
        }

        public void setDspurl(String dspurl) {
            this.dspurl = dspurl;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getThumb_bak() {
            return thumb_bak;
        }

        public void setThumb_bak(String thumb_bak) {
            this.thumb_bak = thumb_bak;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String get_thumb_bak() {
            return _thumb_bak;
        }

        public void set_thumb_bak(String _thumb_bak) {
            this._thumb_bak = _thumb_bak;
        }

        public String get_thumb() {
            return _thumb;
        }

        public void set_thumb(String _thumb) {
            this._thumb = _thumb;
        }

        public String getImgkey() {
            return imgkey;
        }

        public void setImgkey(String imgkey) {
            this.imgkey = imgkey;
        }

        public int getThumbWidth() {
            return thumbWidth;
        }

        public void setThumbWidth(int thumbWidth) {
            this.thumbWidth = thumbWidth;
        }

        public String getDsptime() {
            return dsptime;
        }

        public void setDsptime(String dsptime) {
            this.dsptime = dsptime;
        }

        public int getThumbHeight() {
            return thumbHeight;
        }

        public void setThumbHeight(int thumbHeight) {
            this.thumbHeight = thumbHeight;
        }

        public String getGrpcnt() {
            return grpcnt;
        }

        public void setGrpcnt(String grpcnt) {
            this.grpcnt = grpcnt;
        }

        public boolean isFixedSize() {
            return fixedSize;
        }

        public void setFixedSize(boolean fixedSize) {
            this.fixedSize = fixedSize;
        }

        public String getFnum() {
            return fnum;
        }

        public void setFnum(String fnum) {
            this.fnum = fnum;
        }

        public String getComm_purl() {
            return comm_purl;
        }

        public void setComm_purl(String comm_purl) {
            this.comm_purl = comm_purl;
        }
    }
}

package com.ecommerce;



public class ScreenSizes5 {
        private long SCREENID;
        private String size;
        
        public ScreenSizes5() {
                
        }
        public ScreenSizes5(String size) {
                this.SCREENID = 0;
                this.size = size;
        }
        
        public long getSCREENID() {return this.SCREENID; }
        public String getSize() { return this.size;}
        public void setSCREENID(long id) { this.SCREENID = id;}
        public void setSize(String size) { this.size = size;}
        
        
}
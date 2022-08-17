package com.ecommerce;


import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Map;


public class EProduct5 {
        private long ID;
        private String name;
        private BigDecimal price;
        private Date dateAdded;
        private List<Color5> colors;
        private Collection<ScreenSizes5> screenSizes;
        private Set<OS5> os;
        private Map finance;
        
        public EProduct5() {
                
        }
        
        public long getID() {return this.ID; }
        public String getName() { return this.name;}
        public BigDecimal getPrice() { return this.price;}
        public Date getDateAdded() { return this.dateAdded;}
        public List<Color5> getColors() { return this.colors;}
        public Collection<ScreenSizes5> getScreensizes() { return this.screenSizes;}
        public Set<OS5> getOs() { return this.os;}
        public Map getFinance() { return this.finance;}
        
        public void setID(long id) { this.ID = id;}
        public void setName(String name) { this.name = name;}
        public void setPrice(BigDecimal price) { this.price = price;}
        public void setDateAdded(Date date) { this.dateAdded = date;}
        public void setColors(List<Color5> colors) { this.colors = colors;}
        public void setScreensizes(Collection<ScreenSizes5> sizes) { this.screenSizes = sizes;}
        public void setOs(Set<OS5> os) { this.os = os;}
        public void setFinance(Map finance) { this.finance = finance;}
}
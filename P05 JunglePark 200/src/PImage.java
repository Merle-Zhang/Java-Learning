

import java.awt.Image;

public class PImage {

    public int width = 200;
    public int height = 100;
	public String filename;
    public PImage(String filename) { this.filename = filename; }
    public PImage() {}
    
	public void init(int width, int height, int format) {
		filename = "init";
	}

	
	public void init(int width, int height, int format, int factor) {
		filename = "init";
		
	}

	
	public Image getImage() {
		return null;
	}

	
	public Object getNative() {
		
		return null;
	}

	
	public boolean isModified() {
		
		return false;
	}

	
	public void setModified() {
		
		
	}

	
	public void setModified(boolean m) {
		
		
	}

	
	public int getModifiedX1() {
		
		return -300;
	}

	
	public int getModifiedX2() {
		
		return -300;
	}

	
	public int getModifiedY1() {
		
		return -300;
	}

	
	public int getModifiedY2() {
		
		return -300;
	}

	
	public void loadPixels() {
		
		
	}

	
	public void updatePixels() {
		
		
	}

	
	public void updatePixels(int x, int y, int w, int h) {
		
		
	}

	
	public void resize(int w, int h) {
		
		
	}

	public boolean isLoaded() {
		
		return false;
	}

	
	public void setLoaded() {
		
		
	}

	
	public void setLoaded(boolean l) {
		
		
	}

	
	public int get(int x, int y) {
		
		return -300;
	}

	
	public PImage get(int x, int y, int w, int h) {
	    return new PImage(filename);	
//		return null;
	}

	
	public PImage get() {
	return this;	
//		return null;
	}

	
	public PImage copy() {
	    return new PImage(filename);
//		return null;
	}

	
	public void set(int x, int y, int c) {
		
		
	}

	
	public void set(int x, int y, PImage img) {
		
		
	}

	
	public void mask(int[] maskArray) {
		
		
	}

	
	public void mask(PImage img) {
		
		
	}

	
	public void filter(int kind) {
		
		
	}

	
	public void filter(int kind, float param) {
		
		
	}

	
	public void copy(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
		
		
	}

	
	public void copy(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
		
		
	}

	
	public void blend(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
		
		
	}

	
	public void blend(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
		
		
	}

	
	public boolean save(String filename) {
		
		return false;
	}

}

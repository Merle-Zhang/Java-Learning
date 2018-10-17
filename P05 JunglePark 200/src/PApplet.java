

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class PApplet implements PConstants
{
	public int mouseX = 200; 
	public int mouseY = 200;
	public int width = 800;
	public int height = 600;
	public char key = ' ';
	public boolean focused = true; 
	public static void main(String args) { }

	
	public static class Event {}
	public static class MouseEvent {}
	public static class KeyEvent {}
	public static class PGL {}
	public static class XML {}
	public static class JSONObject {}
	public static class JSONArray {}
	public static class Table {}
	public static class PFont {}
	public static class PShape {}
	public static class PShader {}
	public static class PStyle {}
	public static class PMatrix2D {}
	public static class PMatrix3D {}
	public static class PMatrix {}
		
	public PSurface getSurface() {
		
		return null;
	}

	
	public void settings() {
		
		
	}

	
	public int sketchWidth() {
		
		return -300;
	}

	
	public int sketchHeight() {
		
		return -300;
	}

	
	public String sketchRenderer() {
		
		return null;
	}

	
	public int sketchSmooth() {
		
		return -300;
	}

	
	public boolean sketchFullScreen() {
		
		return false;
	}

	
	public int sketchDisplay() {
		
		return -300;
	}

	
	public String sketchOutputPath() {
		
		return null;
	}

	
	public OutputStream sketchOutputStream() {
		
		return null;
	}

	
	public int sketchWindowColor() {
		
		return -300;
	}

	
	public int sketchPixelDensity() {
		
		return -300;
	}

	
	public int displayDensity() {
		
		return -300;
	}

	
	public int displayDensity(int display) {
		
		return -300;
	}

	
	public void pixelDensity(int density) {
		
		
	}

	
	public void setSize(int width, int height) {
		
		
	}

	
	public void smooth() {
		
		
	}

	
	public void smooth(int level) {
		
		
	}

	
	public void noSmooth() {
		
		
	}

	
	public PGraphics getGraphics() {
		
		return null;
	}

	
	public void orientation(int which) {
		
		
	}

	
	public void start() {
		
		
	}

	
	public void stop() {
		
		
	}

	
	public void pause() {
		
		
	}

	
	public void resume() {
		
		
	}

	
	public void registerMethod(String methodName, Object target) {
		
		
	}

	
	public void unregisterMethod(String name, Object target) {
		
		
	}

	
	public void setup() {
		
		
	}

	
	public void draw() {
		
		
	}

	
	public void fullScreen() {
		
		
	}

	
	public void fullScreen(int display) {
		
		
	}

	
	public void fullScreen(String renderer) {
		
		
	}

	
	public void fullScreen(String renderer, int display) {
		
		
	}

	
	public void size(int width, int height) {
		
		
	}

	
	public void size(int width, int height, String renderer) {
		
		
	}

	
	public void size(int width, int height, String renderer, String path) {
		
		
	}

	
	public PGraphics createGraphics(int w, int h) {
		
		return null;
	}

	
	public PGraphics createGraphics(int w, int h, String renderer) {
		
		return null;
	}

	
	public PGraphics createGraphics(int w, int h, String renderer, String path) {
		
		return null;
	}

	
	public PImage createImage(int w, int h, int format) {
		
		return null;
	}

	
	public void handleDraw() {
		
		
	}

	
	public void redraw() {
		
		
	}

	
	public void loop() {
		
		
	}

	
	public void noLoop() {
		
		
	}

	
	public boolean isLooping() {
		
		return false;
	}

	
	public void postEvent(Event pe) {
		
		
	}

	
	public void mousePressed() {
		
		
	}

	
	public void mousePressed(MouseEvent event) {
		
		
	}

	
	public void mouseReleased() {
		
		
	}

	
	public void mouseReleased(MouseEvent event) {
		
		
	}

	
	public void mouseClicked() {
		
		
	}

	
	public void mouseClicked(MouseEvent event) {
		
		
	}

	
	public void mouseDragged() {
		
		
	}

	
	public void mouseDragged(MouseEvent event) {
		
		
	}

	
	public void mouseMoved() {
		
		
	}

	
	public void mouseMoved(MouseEvent event) {
		
		
	}

	
	public void mouseEntered() {
		
		
	}

	
	public void mouseEntered(MouseEvent event) {
		
		
	}

	
	public void mouseExited() {
		
		
	}

	
	public void mouseExited(MouseEvent event) {
		
		
	}

	
	public void mouseWheel() {
		
		
	}

	
	public void mouseWheel(MouseEvent event) {
		
		
	}

	
	public void keyPressed() {
		
		
	}

	
	public void keyPressed(KeyEvent event) {
		
		
	}

	
	public void keyReleased() {
		
		
	}

	
	public void keyReleased(KeyEvent event) {
		
		
	}

	
	public void keyTyped() {
		
		
	}

	
	public void keyTyped(KeyEvent event) {
		
		
	}

	
	public void focusGained() {
		
		
	}

	
	public void focusLost() {
		
		
	}

	
	public int millis() {
		
		return -300;
	}

	
	public void delay(int napTime) {
		
		
	}

	
	public void frameRate(float fps) {
		
		
	}

	
	public void link(String url) {
		
		
	}

	
	public void die(String what) {
		
		
	}

	
	public void die(String what, Exception e) {
		
		
	}

	
	public void exit() {
		
		
	}

	
	public boolean exitCalled() {
		
		return false;
	}

	
	public void exitActual() {
		
		
	}

	
	public void dispose() {
		
		
	}

	
	public void method(String name) {
		
		
	}

	
	public void thread(String name) {
		
		
	}

	
	public void save(String filename) {
		
		
	}

	
	public void saveFrame() {
		
		
	}

	
	public void saveFrame(String filename) {
		
		
	}

	
	public String insertFrame(String what) {
		
		return null;
	}

	
	public void cursor(int kind) {
		
		
	}

	
	public void cursor(PImage img) {
		
		
	}

	
	public void cursor(PImage img, int x, int y) {
		
		
	}

	
	public void cursor() {
		
		
	}

	
	public void noCursor() {
		
		
	}

	
	public float random(float high) {
		
		return -300;
	}

	
	public float randomGaussian() {
		
		return -300;
	}

	
	public float random(float low, float high) {
		
		return -300;
	}

	
	public void randomSeed(long seed) {
		
		
	}

	
	public float noise(float x) {
		
		return -300;
	}

	
	public float noise(float x, float y) {
		
		return -300;
	}

	
	public float noise(float x, float y, float z) {
		
		return -300;
	}

	
	public void noiseDetail(int lod) {
		
		
	}

	
	public void noiseDetail(int lod, float falloff) {
		
		
	}

	
	public void noiseSeed(long seed) {
		
		
	}

	
	public PImage loadImage(String filename) {
		
		return new PImage(filename);
	}

	
	public PImage loadImage(String filename, String extension) {
		
		return new PImage(filename);
	}

	
	public PImage requestImage(String filename) {
		
		return new PImage(filename);
	}

	
	public PImage requestImage(String filename, String extension) {
		
		return new PImage(filename);
	}

	
	public XML loadXML(String filename) {
		
		return null;
	}

	
	public XML loadXML(String filename, String options) {
		
		return null;
	}

	
	public XML parseXML(String xmlString) {
		
		return null;
	}

	
	public XML parseXML(String xmlString, String options) {
		
		return null;
	}

	
	public boolean saveXML(XML xml, String filename) {
		
		return false;
	}

	
	public boolean saveXML(XML xml, String filename, String options) {
		
		return false;
	}

	
	public JSONObject parseJSONObject(String input) {
		
		return null;
	}

	
	public JSONObject loadJSONObject(String filename) {
		
		return null;
	}

	
	public boolean saveJSONObject(JSONObject json, String filename) {
		
		return false;
	}

	
	public boolean saveJSONObject(JSONObject json, String filename, String options) {
		
		return false;
	}

	
	public JSONArray parseJSONArray(String input) {
		
		return null;
	}

	
	public JSONArray loadJSONArray(String filename) {
		
		return null;
	}

	
	public boolean saveJSONArray(JSONArray json, String filename) {
		
		return false;
	}

	
	public boolean saveJSONArray(JSONArray json, String filename, String options) {
		
		return false;
	}

	
	public Table loadTable(String filename) {
		
		return null;
	}

	
	public Table loadTable(String filename, String options) {
		
		return null;
	}

	
	public boolean saveTable(Table table, String filename) {
		
		return false;
	}

	
	public boolean saveTable(Table table, String filename, String options) {
		
		return false;
	}

	
	public PFont loadFont(String filename) {
		
		return null;
	}

	
	public PFont createFont(String name, float size) {
		
		return null;
	}

	
	public PFont createFont(String name, float size, boolean smooth) {
		
		return null;
	}

	
	public PFont createFont(String name, float size, boolean smooth, char[] charset) {
		
		return null;
	}

	
	public void selectInput(String prompt, String callback) {
		
		
	}

	
	public void selectInput(String prompt, String callback, File file) {
		
		
	}

	
	public void selectInput(String prompt, String callback, File file, Object callbackObject) {
		
		
	}

	
	public void selectOutput(String prompt, String callback) {
		
		
	}

	
	public void selectOutput(String prompt, String callback, File file) {
		
		
	}

	
	public void selectOutput(String prompt, String callback, File file, Object callbackObject) {
		
		
	}

	
	public void selectFolder(String prompt, String callback) {
		
		
	}

	
	public void selectFolder(String prompt, String callback, File file) {
		
		
	}

	
	public void selectFolder(String prompt, String callback, File file, Object callbackObject) {
		
		
	}

	
	public String[] listPaths(String path, String... options) {
		
		return null;
	}

	
	public File[] listFiles(String path, String... options) {
		
		return null;
	}

	
	public BufferedReader createReader(String filename) {
		
		return null;
	}

	
	public PrintWriter createWriter(String filename) {
		
		return null;
	}

	
	public InputStream createInput(String filename) {
		
		return null;
	}

	
	public InputStream createInputRaw(String filename) {
		
		return null;
	}

	
	public byte[] loadBytes(String filename) {
		
		return null;
	}

	
	public String[] loadStrings(String filename) {
		
		return null;
	}

	
	public OutputStream createOutput(String filename) {
		
		return null;
	}

	
	public boolean saveStream(String target, String source) {
		
		return false;
	}

	
	public boolean saveStream(File target, String source) {
		
		return false;
	}

	
	public boolean saveStream(String target, InputStream source) {
		
		return false;
	}

	
	public void saveBytes(String filename, byte[] data) {
		
		
	}

	
	public void saveStrings(String filename, String[] data) {
		
		
	}

	
	public String sketchPath() {
		
		return null;
	}

	
	public String sketchPath(String where) {
		
		return null;
	}

	
	public File sketchFile(String where) {
		
		return null;
	}

	
	public String savePath(String where) {
		
		return null;
	}

	
	public File saveFile(String where) {
		
		return null;
	}

	
	public String dataPath(String where) {
		
		return null;
	}

	
	public File dataFile(String where) {
		
		return null;
	}

	
	public int color(int gray) {
		
		return -300;
	}

	
	public int color(float fgray) {
		
		return -300;
	}

	
	public int color(int gray, int alpha) {
		
		return -300;
	}

	
	public int color(float fgray, float falpha) {
		
		return -300;
	}

	
	public int color(int v1, int v2, int v3) {
		
		return -300;
	}

	
	public int color(int v1, int v2, int v3, int alpha) {
		
		return -300;
	}

	
	public int color(float v1, float v2, float v3) {
		
		return -300;
	}

	
	public int color(float v1, float v2, float v3, float alpha) {
		
		return -300;
	}

	
	public int lerpColor(int c1, int c2, float amt) {
		
		return -300;
	}

	
	public void frameMoved(int x, int y) {
		
		
	}

	
	public void frameResized(int w, int h) {
		
		
	}

	
	public PGraphics beginRecord(String renderer, String filename) {
		
		return null;
	}

	
	public void beginRecord(PGraphics recorder) {
		
		
	}

	
	public void endRecord() {
		
		
	}

	
	public PGraphics beginRaw(String renderer, String filename) {
		
		return null;
	}

	
	public void beginRaw(PGraphics rawGraphics) {
		
		
	}

	
	public void endRaw() {
		
		
	}

	
	public void loadPixels() {
		
		
	}

	
	public void updatePixels() {
		
		
	}

	
	public void updatePixels(int x1, int y1, int x2, int y2) {
		
		
	}

	
	public PGL beginPGL() {
		
		return null;
	}

	
	public void endPGL() {
		
		
	}

	
	public void flush() {
		
		
	}

	
	public void hint(int which) {
		
		
	}

	
	public void beginShape() {
		
		
	}

	
	public void beginShape(int kind) {
		
		
	}

	
	public void edge(boolean edge) {
		
		
	}

	
	public void normal(float nx, float ny, float nz) {
		
		
	}

	
	public void attribPosition(String name, float x, float y, float z) {
		
		
	}

	
	public void attribNormal(String name, float nx, float ny, float nz) {
		
		
	}

	
	public void attribColor(String name, int color) {
		
		
	}

	
	public void attrib(String name, float... values) {
		
		
	}

	
	public void attrib(String name, int... values) {
		
		
	}

	
	public void attrib(String name, boolean... values) {
		
		
	}

	
	public void textureMode(int mode) {
		
		
	}

	
	public void textureWrap(int wrap) {
		
		
	}

	
	public void texture(PImage image) {
		
		
	}

	
	public void noTexture() {
		
		
	}

	
	public void vertex(float x, float y) {
		
		
	}

	
	public void vertex(float x, float y, float z) {
		
		
	}

	
	public void vertex(float[] v) {
		
		
	}

	
	public void vertex(float x, float y, float u, float v) {
		
		
	}

	
	public void vertex(float x, float y, float z, float u, float v) {
		
		
	}

	
	public void beginContour() {
		
		
	}

	
	public void endContour() {
		
		
	}

	
	public void endShape() {
		
		
	}

	
	public void endShape(int mode) {
		
		
	}

	
	public PShape loadShape(String filename) {
		
		return null;
	}

	
	public PShape loadShape(String filename, String options) {
		
		return null;
	}

	
	public PShape createShape() {
		
		return null;
	}

	
	public PShape createShape(int type) {
		
		return null;
	}

	
	public PShape createShape(int kind, float... p) {
		
		return null;
	}

	
	public PShader loadShader(String fragFilename) {
		
		return null;
	}

	
	public PShader loadShader(String fragFilename, String vertFilename) {
		
		return null;
	}

	
	public void shader(PShader shader) {
		
		
	}

	
	public void shader(PShader shader, int kind) {
		
		
	}

	
	public void resetShader() {
		
		
	}

	
	public void resetShader(int kind) {
		
		
	}

	
	public void filter(PShader shader) {
		
		
	}

	
	public void clip(float a, float b, float c, float d) {
		
		
	}

	
	public void noClip() {
		
		
	}

	
	public void blendMode(int mode) {
		
		
	}

	
	public void bezierVertex(float x2, float y2, float x3, float y3, float x4, float y4) {
		
		
	}

	
	public void bezierVertex(float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
		
		
	}

	
	public void quadraticVertex(float cx, float cy, float x3, float y3) {
		
		
	}

	
	public void quadraticVertex(float cx, float cy, float cz, float x3, float y3, float z3) {
		
		
	}

	
	public void curveVertex(float x, float y) {
		
		
	}

	
	public void curveVertex(float x, float y, float z) {
		
		
	}

	
	public void point(float x, float y) {
		
		
	}

	
	public void point(float x, float y, float z) {
		
		
	}

	
	public void line(float x1, float y1, float x2, float y2) {
		
		
	}

	
	public void line(float x1, float y1, float z1, float x2, float y2, float z2) {
		
		
	}

	
	public void triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
		
		
	}

	
	public void quad(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		
		
	}

	
	public void rectMode(int mode) {
		
		
	}

	
	public void rect(float a, float b, float c, float d) {
		
		
	}

	
	public void rect(float a, float b, float c, float d, float r) {
		
		
	}

	
	public void rect(float a, float b, float c, float d, float tl, float tr, float br, float bl) {
		
		
	}

	
	public void ellipseMode(int mode) {
		
		
	}

	
	public void ellipse(float a, float b, float c, float d) {
		
		
	}

	
	public void arc(float a, float b, float c, float d, float start, float stop) {
		
		
	}

	
	public void arc(float a, float b, float c, float d, float start, float stop, int mode) {
		
		
	}

	
	public void box(float size) {
		
		
	}

	
	public void box(float w, float h, float d) {
		
		
	}

	
	public void sphereDetail(int res) {
		
		
	}

	
	public void sphereDetail(int ures, int vres) {
		
		
	}

	
	public void sphere(float r) {
		
		
	}

	
	public float bezierPoint(float a, float b, float c, float d, float t) {
		
		return -300;
	}

	
	public float bezierTangent(float a, float b, float c, float d, float t) {
		
		return -300;
	}

	
	public void bezierDetail(int detail) {
		
		
	}

	
	public void bezier(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		
		
	}

	
	public void bezier(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3,
			float x4, float y4, float z4) {
		
		
	}

	
	public float curvePoint(float a, float b, float c, float d, float t) {
		
		return -300;
	}

	
	public float curveTangent(float a, float b, float c, float d, float t) {
		
		return -300;
	}

	
	public void curveDetail(int detail) {
		
		
	}

	
	public void curveTightness(float tightness) {
		
		
	}

	
	public void curve(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		
		
	}

	
	public void curve(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3,
			float x4, float y4, float z4) {
		
		
	}

	
	public void imageMode(int mode) {
		
		
	}

	
	public void image(PImage img, float a, float b) {
		
		
	}

	
	public void image(PImage img, float a, float b, float c, float d) {
		
		
	}

	
	public void image(PImage img, float a, float b, float c, float d, int u1, int v1, int u2, int v2) {
		
		
	}

	
	public void shapeMode(int mode) {
		
		
	}

	
	public void shape(PShape shape) {
		
		
	}

	
	public void shape(PShape shape, float x, float y) {
		
		
	}

	
	public void shape(PShape shape, float a, float b, float c, float d) {
		
		
	}

	
	public void textAlign(int alignX) {
		
		
	}

	
	public void textAlign(int alignX, int alignY) {
		
		
	}

	
	public float textAscent() {
		
		return -300;
	}

	
	public float textDescent() {
		
		return -300;
	}

	
	public void textFont(PFont which) {
		
		
	}

	
	public void textFont(PFont which, float size) {
		
		
	}

	
	public void textLeading(float leading) {
		
		
	}

	
	public void textMode(int mode) {
		
		
	}

	
	public void textSize(float size) {
		
		
	}

	
	public float textWidth(char c) {
		
		return -300;
	}

	
	public float textWidth(String str) {
		
		return -300;
	}

	
	public float textWidth(char[] chars, int start, int length) {
		
		return -300;
	}

	
	public void text(char c, float x, float y) {
		
		
	}

	
	public void text(char c, float x, float y, float z) {
		
		
	}

	
	public void text(String str, float x, float y) {
		
		
	}

	
	public void text(char[] chars, int start, int stop, float x, float y) {
		
		
	}

	
	public void text(String str, float x, float y, float z) {
		
		
	}

	
	public void text(char[] chars, int start, int stop, float x, float y, float z) {
		
		
	}

	
	public void text(String str, float x1, float y1, float x2, float y2) {
		
		
	}

	
	public void text(int num, float x, float y) {
		
		
	}

	
	public void text(int num, float x, float y, float z) {
		
		
	}

	
	public void text(float num, float x, float y) {
		
		
	}

	
	public void text(float num, float x, float y, float z) {
		
		
	}

	
	public void pushMatrix() {
		
		
	}

	
	public void popMatrix() {
		
		
	}

	
	public void translate(float x, float y) {
		
		
	}

	
	public void translate(float x, float y, float z) {
		
		
	}

	
	public void rotate(float angle) {
		
		
	}

	
	public void rotateX(float angle) {
		
		
	}

	
	public void rotateY(float angle) {
		
		
	}

	
	public void rotateZ(float angle) {
		
		
	}

	
	public void rotate(float angle, float x, float y, float z) {
		
		
	}

	
	public void scale(float s) {
		
		
	}

	
	public void scale(float x, float y) {
		
		
	}

	
	public void scale(float x, float y, float z) {
		
		
	}

	
	public void shearX(float angle) {
		
		
	}

	
	public void shearY(float angle) {
		
		
	}

	
	public void resetMatrix() {
		
		
	}

	
	public void applyMatrix(PMatrix source) {
		
		
	}

	
	public void applyMatrix(PMatrix2D source) {
		
		
	}

	
	public void applyMatrix(float n0, float n01, float n02, float n10, float n11, float n12) {
		
		
	}

	
	public void applyMatrix(PMatrix3D source) {
		
		
	}

	
	public void applyMatrix(float n00, float n01, float n02, float n03, float n10, float n11, float n12, float n13,
			float n20, float n21, float n22, float n23, float n30, float n31, float n32, float n33) {
		
		
	}

	
	public PMatrix getMatrix() {
		
		return null;
	}

	
	public PMatrix2D getMatrix(PMatrix2D target) {
		
		return null;
	}

	
	public PMatrix3D getMatrix(PMatrix3D target) {
		
		return null;
	}

	
	public void setMatrix(PMatrix source) {
		
		
	}

	
	public void setMatrix(PMatrix2D source) {
		
		
	}

	
	public void setMatrix(PMatrix3D source) {
		
		
	}

	
	public void printMatrix() {
		
		
	}

	
	public void beginCamera() {
		
		
	}

	
	public void endCamera() {
		
		
	}

	
	public void camera() {
		
		
	}

	
	public void camera(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX,
			float upY, float upZ) {
		
		
	}

	
	public void printCamera() {
		
		
	}

	
	public void ortho() {
		
		
	}

	
	public void ortho(float left, float right, float bottom, float top) {
		
		
	}

	
	public void ortho(float left, float right, float bottom, float top, float near, float far) {
		
		
	}

	
	public void perspective() {
		
		
	}

	
	public void perspective(float fovy, float aspect, float zNear, float zFar) {
		
		
	}

	
	public void frustum(float left, float right, float bottom, float top, float near, float far) {
		
		
	}

	
	public void printProjection() {
		
		
	}

	
	public float screenX(float x, float y) {
		
		return -300;
	}

	
	public float screenY(float x, float y) {
		
		return -300;
	}

	
	public float screenX(float x, float y, float z) {
		
		return -300;
	}

	
	public float screenY(float x, float y, float z) {
		
		return -300;
	}

	
	public float screenZ(float x, float y, float z) {
		
		return -300;
	}

	
	public float modelX(float x, float y, float z) {
		
		return -300;
	}

	
	public float modelY(float x, float y, float z) {
		
		return -300;
	}

	
	public float modelZ(float x, float y, float z) {
		
		return -300;
	}

	
	public void pushStyle() {
		
		
	}

	
	public void popStyle() {
		
		
	}

	
	public void style(PStyle s) {
		
		
	}

	
	public void strokeWeight(float weight) {
		
		
	}

	
	public void strokeJoin(int join) {
		
		
	}

	
	public void strokeCap(int cap) {
		
		
	}

	
	public void noStroke() {
		
		
	}

	
	public void stroke(int rgb) {
		
		
	}

	
	public void stroke(int rgb, float alpha) {
		
		
	}

	
	public void stroke(float gray) {
		
		
	}

	
	public void stroke(float gray, float alpha) {
		
		
	}

	
	public void stroke(float v1, float v2, float v3) {
		
		
	}

	
	public void stroke(float v1, float v2, float v3, float alpha) {
		
		
	}

	
	public void noTint() {
		
		
	}

	
	public void tint(int rgb) {
		
		
	}

	
	public void tint(int rgb, float alpha) {
		
		
	}

	
	public void tint(float gray) {
		
		
	}

	
	public void tint(float gray, float alpha) {
		
		
	}

	
	public void tint(float v1, float v2, float v3) {
		
		
	}

	
	public void tint(float v1, float v2, float v3, float alpha) {
		
		
	}

	
	public void noFill() {
		
		
	}

	
	public void fill(int rgb) {
		
		
	}

	
	public void fill(int rgb, float alpha) {
		
		
	}

	
	public void fill(float gray) {
		
		
	}

	
	public void fill(float gray, float alpha) {
		
		
	}

	
	public void fill(float v1, float v2, float v3) {
		
		
	}

	
	public void fill(float v1, float v2, float v3, float alpha) {
		
		
	}

	
	public void ambient(int rgb) {
		
		
	}

	
	public void ambient(float gray) {
		
		
	}

	
	public void ambient(float v1, float v2, float v3) {
		
		
	}

	
	public void specular(int rgb) {
		
		
	}

	
	public void specular(float gray) {
		
		
	}

	
	public void specular(float v1, float v2, float v3) {
		
		
	}

	
	public void shininess(float shine) {
		
		
	}

	
	public void emissive(int rgb) {
		
		
	}

	
	public void emissive(float gray) {
		
		
	}

	
	public void emissive(float v1, float v2, float v3) {
		
		
	}

	
	public void lights() {
		
		
	}

	
	public void noLights() {
		
		
	}

	
	public void ambientLight(float v1, float v2, float v3) {
		
		
	}

	
	public void ambientLight(float v1, float v2, float v3, float x, float y, float z) {
		
		
	}

	
	public void directionalLight(float v1, float v2, float v3, float nx, float ny, float nz) {
		
		
	}

	
	public void pointLight(float v1, float v2, float v3, float x, float y, float z) {
		
		
	}

	
	public void spotLight(float v1, float v2, float v3, float x, float y, float z, float nx, float ny, float nz,
			float angle, float concentration) {
		
		
	}

	
	public void lightFalloff(float constant, float linear, float quadratic) {
		
		
	}

	
	public void lightSpecular(float v1, float v2, float v3) {
		
		
	}

	
	public void background(int rgb) {
		
		
	}

	
	public void background(int rgb, float alpha) {
		
		
	}

	
	public void background(float gray) {
		
		
	}

	
	public void background(float gray, float alpha) {
		
		
	}

	
	public void background(float v1, float v2, float v3) {
		
		
	}

	
	public void background(float v1, float v2, float v3, float alpha) {
		
		
	}

	
	public void clear() {
		
		
	}

	
	public void background(PImage image) {
		
		
	}

	
	public void colorMode(int mode) {
		
		
	}

	
	public void colorMode(int mode, float max) {
		
		
	}

	
	public void colorMode(int mode, float max1, float max2, float max3) {
		
		
	}

	
	public void colorMode(int mode, float max1, float max2, float max3, float maxA) {
		
		
	}

	
	public float alpha(int rgb) {
		
		return -300;
	}

	
	public float red(int rgb) {
		
		return -300;
	}

	
	public float green(int rgb) {
		
		return -300;
	}

	
	public float blue(int rgb) {
		
		return -300;
	}

	
	public float hue(int rgb) {
		
		return -300;
	}

	
	public float saturation(int rgb) {
		
		return -300;
	}

	
	public float brightness(int rgb) {
		
		return -300;
	}

	
	public int get(int x, int y) {
		
		return -300;
	}

	
	public PImage get(int x, int y, int w, int h) {
		
		return null;
	}

	
	public PImage get() {
		
		return null;
	}

	
	public PImage copy() {
		
		return null;
	}

	
	public void set(int x, int y, int c) {
		
		
	}

	
	public void set(int x, int y, PImage img) {
		
		
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

}

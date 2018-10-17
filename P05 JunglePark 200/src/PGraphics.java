

public class PGraphics {

	public static class PGL {}
	public static class PShape {} 
	public static class PShader {} 
	public static class PFont {} 
	public static class PMatrix2D {} 
	public static class PMatrix3D {} 
	public static class PMatrix {} 
	public static class PStyle {} 
	
	public void setParent(PApplet parent) {
		
		
	}

	
	public void setPrimary(boolean primary) {
		
		
	}

	
	public void setPath(String path) {
		
		
	}

	
	public void setSize(int w, int h) {
		
		
	}

	
	public void dispose() {
		
		
	}

	
	public PSurface createSurface() {
		
		return null;
	}

	
	public void setCache(PImage image, Object storage) {
		
		
	}

	
	public Object getCache(PImage image) {
		
		return null;
	}

	
	public void removeCache(PImage image) {
		
		
	}

	
	public void beginDraw() {
		
		
	}

	
	public void endDraw() {
		
		
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

	
	public void smooth() {
		
		
	}

	
	public void smooth(int quality) {
		
		
	}

	
	public void noSmooth() {
		
		
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

	
	public void applyMatrix(float n00, float n01, float n02, float n10, float n11, float n12) {
		
		
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

	
	public PStyle getStyle() {
		
		return null;
	}

	
	public PStyle getStyle(PStyle s) {
		
		return null;
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

	
	public int color(int c) {
		
		return -300;
	}

	
	public int color(float gray) {
		
		return -300;
	}

	
	public int color(int c, int alpha) {
		
		return -300;
	}

	
	public int color(int c, float alpha) {
		
		return -300;
	}

	
	public int color(float gray, float alpha) {
		
		return -300;
	}

	
	public int color(int v1, int v2, int v3) {
		
		return -300;
	}

	
	public int color(float v1, float v2, float v3) {
		
		return -300;
	}

	
	public int color(int v1, int v2, int v3, int a) {
		
		return -300;
	}

	
	public int color(float v1, float v2, float v3, float a) {
		
		return -300;
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

	
	public int lerpColor(int c1, int c2, float amt) {
		
		return -300;
	}

	
	public void beginRaw(PGraphics rawGraphics) {
		
		
	}

	
	public void endRaw() {
		
		
	}

	
	public boolean haveRaw() {
		
		return false;
	}

	
	public PGraphics getRaw() {
		
		return null;
	}

	
	public boolean displayable() {
		
		return false;
	}

	
	public boolean is2D() {
		
		return false;
	}

	
	public boolean is3D() {
		
		return false;
	}

	
	public boolean isGL() {
		
		return false;
	}

	
	public boolean is2X() {
		
		return false;
	}

	
	public boolean save(String filename) {
		
		return false;
	}

}

package example.helloworld;

class HelloMessageProvider {

	private final HelloNameProvider nameProvider;

	HelloMessageProvider(HelloNameProvider nameProvider) {
		this.nameProvider = nameProvider;
	}

	public String getMessage() {
		return "Hello " + this.nameProvider.getName() + "!";
	}

}

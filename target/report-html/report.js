$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Contas.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Contas",
  "description": "Como um usuario\r\nQuero cadastrar contas\r\nPara distribuir meu dinheiro de forma organizada.",
  "id": "contas",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "id": "contas;deve-inserir-uma-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que estou acessando a aplicacao",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "inserir o usuario \"teste1010@gmail.com\"\u003e",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "a senha \"123456\"",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "visualizo a pagina inicial",
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "seleciono contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "seleciono adicionar",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "informo a conta \"Conta de Teste\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "a conta e inserida com sucesso.",
  "keyword": "Entao "
});
formatter.match({
  "location": "InserirContasSteps.que_estou_acessando_a_aplicacao()"
});
formatter.result({
  "duration": 15954251500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teste1010@gmail.com",
      "offset": 19
    }
  ],
  "location": "InserirContasSteps.inserir_o_usuario(String)"
});
formatter.result({
  "duration": 259859300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 9
    }
  ],
  "location": "InserirContasSteps.a_senha(String)"
});
formatter.result({
  "duration": 102871700,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.seleciono_entrar()"
});
formatter.result({
  "duration": 793346000,
  "status": "passed"
});
formatter.match({
  "location": "InserirContasSteps.visualizo_a_pagina_inicial()"
});
formatter.result({
  "duration": 62820900,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //div[@class\u003d\u0027alert alert-success\u0027 because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//div[@class\u003d\u0027alert alert-success\u0027\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d81.0.4044.122)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027SAO136NB0116305\u0027, ip: \u0027192.168.0.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\GYRODR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52105}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 0b3c817629139a84e2b2138ab08689a9\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027alert alert-success\u0027}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat Steps.InserirContasSteps.visualizo_a_pagina_inicial(InserirContasSteps.java:42)\r\n\tat ✽.Entao visualizo a pagina inicial(src/test/resources/features/Contas.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "InserirContasSteps.seleciono_contas()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InserirContasSteps.seleciono_adicionar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta de Teste",
      "offset": 17
    }
  ],
  "location": "InserirContasSteps.informo_a_conta(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InserirContasSteps.seleciono_Salvar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InserirContasSteps.a_conta_e_inserida_com_sucesso()"
});
formatter.result({
  "status": "skipped"
});
});
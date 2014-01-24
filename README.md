# dogecoin-paper-wallet

Generate a Dogecoin paper wallet offline, from the command line of your terminal.

## Usage

First, install [leiningen](http://leiningen.org/) if you don't have it. Then type:

`lein run`

The program will print out a private key and a public dogecoin address, and a wallet.png file
that you can send to your printer (hopefully not connected to the internet). 
The paper wallet is unencrypted, so keep it in a safe place.

The wallet will look like this:

 ![wallet](https://raw.github.com/dbasch/dogecoin-paper-wallet/master/wallet.png)

 You may want to do this on a computer that's never been connected to the internet. For example, you could:

 * Boot a live CD/USB of Ubuntu, don't connect it to a network.
 * run `lein uberjar` on a trusted computer, copy the jar file to a pen drive and then to the Ubuntu box.
 * run `java -jar dogecoin-[version]-SNAPSHOT-standalone.jar` on the Ubuntu box. 

## Password-protected wallets

If you run 

`lein run "correct horse battery staple"`

You will get a wallet with an encrypted key. It will look like:

![wallet](https://raw.github.com/dbasch/dogecoin-paper-wallet/master/encryptedwallet.png)

You will need your passphrase when you want to convert it into the Wallet Import Format. You can decrypt it by running:

`lein run -m dogecoin.bip38 "correct horse battery staple" 6P......`

If you do this, you should either memorize your passphase or keep it in a safe place separate from the wallet. Otherwise, you might as well generate it unencrypted.

## WARNING WARNING WARNING 

Be very careful when using this program. It uses the bitcoinj library for key generation
 so I'm not responsible for any bugs that might generate insecure wallets. Use at your own risk.

Find this useful? send me a tip at **DHpZsQCDKq9WbqyqfetMcGq87pFZfkwLBh** :)

## License

Copyright © 2014 Diego Basch

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

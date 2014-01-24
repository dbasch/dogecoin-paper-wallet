(ns dogecoin.bip38
  (:require dogecoin.wallet)
  (:import com.fruitcat.bitcoin.BIP38))

(defn -main [& args]
  (com.fruitcat.bitcoin.BIP38/setNetParams (dogecoin.wallet/np))
  (println (first args))
  (println (com.fruitcat.bitcoin.BIP38/decrypt (first args) (second args))))
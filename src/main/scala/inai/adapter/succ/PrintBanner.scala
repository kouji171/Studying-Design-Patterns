package inai.adapter.succ

import inai.adapter.Print

/**
 * 通訳をするクラス
 */
class PrintBanner(banner: Banner) extends Print {
  def printWeak = banner.showWithParen
  def printStrong = banner.showWithAster
}
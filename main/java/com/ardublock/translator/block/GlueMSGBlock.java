package com.ardublock.translator.block;

import com.ardublock.translator.Translator;
import com.ardublock.translator.block.exception.SocketNullException;
import com.ardublock.translator.block.exception.SubroutineNotDeclaredException;

public class GlueMSGBlock extends TranslatorBlock
{
	public GlueMSGBlock(Long blockId, Translator translator, String codePrefix, String codeSuffix, String label)
	{
		super(blockId, translator, codePrefix, codeSuffix, label);
	}

	public String toCode() throws SocketNullException, SubroutineNotDeclaredException
	{
		//TODO take out special character
		String ret;
		ret = label.replaceAll("\\\\", "\\\\\\\\");
		//ret = ret.replaceAll("\"", "\\\\\"");
//		ret = ret.replaceAll(";", "\\\\;");
//		ret = codePrefix + "\"" + ret + "\"" + codeSuffix;
//		TranslatorBlock translatorBlock = this.getTranslatorBlockAtSocket(0, codePrefix, codeSuffix);
//		if (translatorBlock != null)
//		{
//			ret = ret + translatorBlock.toCode();
//		}
		return ret;
	}

}
